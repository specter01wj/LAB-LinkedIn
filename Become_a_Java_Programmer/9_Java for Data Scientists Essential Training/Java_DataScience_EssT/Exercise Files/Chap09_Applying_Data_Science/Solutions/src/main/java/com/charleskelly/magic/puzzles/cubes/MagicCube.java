package com.charleskelly.magic.puzzles.cubes;

import com.charleskelly.magic.puzzles.cubes.adjacency.AdjacencyMatrix;
import com.charleskelly.magic.puzzles.cubes.pairs.CoordinatesContentsPair;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;
import com.charleskelly.magic.tuple.contents.CellContents;
import com.charleskelly.magic.tuple.contents.CellDifferences;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;
import com.charleskelly.magic.tuple.coordinates.CellOffsets;

import java.util.*;

/**
 * Created by Charles Kelly.
 */
public class MagicCube
{
    private AdjacencyMatrix adjacencyMatrix;
    private MagicCubeCharacteristics magicCubeCharacteristics;
    private List<CoordinatesContentsPair> coordinatesContentsPairList = new ArrayList<CoordinatesContentsPair>();

    private Map<CellCoordinates, CellContents> coordinatesContentsMap = new HashMap<CellCoordinates, CellContents>();

    /**
     * sorted list of cell coordinates that can be used as "indices" into Sudoku puzzle or "offsets" for creating Sudoku puzzle
     */
    private List <CellCoordinates>	cellCoordinatesKeysList;
    private boolean					offsetFlag;
    private Tuple                   offsetTuple;

    public MagicCube(MagicCubeCharacteristics magicCubeCharacteristics, AdjacencyMatrix adjacencyMatrix) throws Exception
    {
        this(magicCubeCharacteristics, adjacencyMatrix, null);
    }

    public MagicCube(MagicCubeCharacteristics magicCubeCharacteristics, AdjacencyMatrix adjacencyMatrix, Tuple offsetTuple) throws TupleException, Exception
    {
        if (null == magicCubeCharacteristics)
            throw new Exception ("hyperSquareCharacteristics parameter is null");
        if (null == adjacencyMatrix)
            throw new Exception ("directionController parameter is null");
        if (null != offsetTuple)
        {
            offsetFlag = true;
            this.offsetTuple = offsetTuple;
        }// if (null != offsetTuple)

        this.magicCubeCharacteristics = magicCubeCharacteristics;
        this.adjacencyMatrix = adjacencyMatrix;
        ////////////////////////////////////////////////////////////////////
        this.preparePairList();
        prepareCellCoordinatesKeysList();
    }

    private void prepareCellCoordinatesKeysList() throws TupleException, Exception
    {
        cellCoordinatesKeysList = new ArrayList<CellCoordinates>();

        for (CoordinatesContentsPair coordinatesContentsPair : coordinatesContentsPairList)
            cellCoordinatesKeysList.add(coordinatesContentsPair.getCellCoordinates());

        Collections.sort(cellCoordinatesKeysList);
    }

    private void preparePairList() throws TupleException, Exception
    {
        int totalCells = magicCubeCharacteristics.getDerivedTotalCells();

        for (int i=0; i<totalCells; i++)
        {
            CellCoordinates cellCoordinates = convertListIndexToCellCoordinate (i);
            CellContents cellContents = calculateCellContents(cellCoordinates);
            CoordinatesContentsPair coordinatesContentsPair = new CoordinatesContentsPair (cellCoordinates, cellContents);
            coordinatesContentsPairList.add(i,coordinatesContentsPair);
            coordinatesContentsMap.put(cellCoordinates, cellContents);
        }// for (int i=0; i<totalCells; i++)
    }

    private CellCoordinates convertListIndexToCellCoordinate(int index) throws TupleException
    {
        int quotient, dividend, divisor, remainder, dimensions;

        dimensions = magicCubeCharacteristics.getDimensions();
        dividend = index;
        int [] dataHolder = new int [dimensions];

        for (int i=dimensions - 1; i>=0; i--)
        {
            divisor        = magicCubeCharacteristics.getDerivedPolynomialBase().getTupleComponent(i);
            quotient       = dividend / divisor;
            remainder      = dividend % divisor;
            dataHolder[i]  = quotient;

            dividend       = remainder;
        }// for (int i=dimensions - 1; i>=0; i--)

        CellCoordinates cellCoordinates = new CellCoordinates(dimensions, dataHolder);
        return cellCoordinates;
    }

    public CellContents calculateCellContents(CellOffsets rotationalCellOffsets) throws TupleException, Exception
    {
        CellCoordinates cellCoordinates =
                new CellCoordinates(rotationalCellOffsets.getTupleSize(), rotationalCellOffsets.getTupleData());

        return calculateCellContents (cellCoordinates);
    }

    /**
     * We'll use differences from the "all zeros" cell to calculate the cell contents;
     * since were subtracting 0 from every component, the difference and the cell
     * contents are the same.  If the difference is negative, we will resolve it
     * to positive modulo the order of the magic cube.
     */
    private CellContents calculateCellContents(CellCoordinates cellCoordinates) throws TupleException, Exception
    {
        CellContents cellContents 		= null;
            ////////////////////////////////////////////////////////////////////
            // Calculate the cell offsets (difference in coordinates) between
            // this cell and the all zeros cell
            ////////////////////////////////////////////////////////////////////
        CellOffsets cellOffsets = new CellOffsets (magicCubeCharacteristics.getDimensions(),
                                                   magicCubeCharacteristics.getDerivedAllZerosCellCoordinates(),
                                                   cellCoordinates);

            ////////////////////////////////////////////////////////////////////
            // Calculate the differences in cell contents between this cell and
            // the all zeros cell
            ////////////////////////////////////////////////////////////////////
        CellDifferences cellDifferences = new CellDifferences (magicCubeCharacteristics.getDimensions(),
                                                               cellOffsets,
                                                               adjacencyMatrix,
                                                               magicCubeCharacteristics.getOrder() );

            ////////////////////////////////////////////////////////////////////
            // Extract the data from the cell differences.  Because this is the
            // difference from zero, it will become our cell contents
            ////////////////////////////////////////////////////////////////////
        int[] dataHolder = cellDifferences.getTupleData();
        int dataHolderLength = dataHolder.length;
        for (int i=0; i<dataHolderLength; i++)
        {
            if (0 > dataHolder[i])
            {
                dataHolder[i] = magicCubeCharacteristics.getOrder() + dataHolder[i];
            }
            dataHolder[i] = dataHolder[i] % magicCubeCharacteristics.getOrder();
        }

        if(offsetFlag)
        {
            for (int j=0; j<dataHolderLength; j++)
            {
                dataHolder[j] = (dataHolder[j] - this.offsetTuple.getTupleComponent(j)) % magicCubeCharacteristics.getOrder();
                if (0 > dataHolder[j])
                {
                    dataHolder[j] = magicCubeCharacteristics.getOrder() + dataHolder[j];
                }// if (0 > dataHolder[j])
            }// for (int j=0; j<dataHolderLength; j++)
        }// if(offsetFlag)

        cellContents = new CellContents (magicCubeCharacteristics.getDimensions(), dataHolder);

        return cellContents;
    }

    public AdjacencyMatrix getAdjacencyMatrix()
    {
        return adjacencyMatrix;
    }

    public MagicCubeCharacteristics getMagicCubeCharacteristics()
    {
        return magicCubeCharacteristics;
    }

    public List<CoordinatesContentsPair> getCoordinatesContentsPairList()
    {
        return coordinatesContentsPairList;
    }

    public Map<CellCoordinates, CellContents> getCoordinatesContentsMap()
    {
        return coordinatesContentsMap;
    }

    public List<CellCoordinates> getCellCoordinatesKeysList()
    {
        return cellCoordinatesKeysList;
    }

    public boolean isOffsetFlag()
    {
        return offsetFlag;
    }

    public Tuple getOffsetTuple()
    {
        return offsetTuple;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((magicCubeCharacteristics == null) ? 0
                : magicCubeCharacteristics.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MagicCube other = (MagicCube) obj;
        if (magicCubeCharacteristics == null)
        {
            if (other.magicCubeCharacteristics != null)
                return false;
        } else if (!magicCubeCharacteristics
                .equals(other.magicCubeCharacteristics))
            return false;
        return true;
    }
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        try
        {
            for (Map.Entry<CellCoordinates, CellContents> entry : coordinatesContentsMap.entrySet())
            {
                CellContents value = entry.getValue();
                sb.append(value);
                sb.append("\t");
            }// for (Map.Entry<CellCoordinates, CellContents> entry : coordinatesContentsMap.entrySet())
        }
        catch(Exception e)
        {
            return e.toString();
        }

        return sb.toString();
    }
}
