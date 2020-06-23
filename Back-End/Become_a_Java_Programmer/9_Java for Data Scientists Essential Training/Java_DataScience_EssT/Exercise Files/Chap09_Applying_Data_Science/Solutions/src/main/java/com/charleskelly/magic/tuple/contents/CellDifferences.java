package com.charleskelly.magic.tuple.contents;

import com.charleskelly.magic.puzzles.cubes.adjacency.AdjacencyMatrix;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;
import com.charleskelly.magic.tuple.coordinates.CellOffsets;

/**
 * Created by Charles on 9/27/2016.
 */
public class CellDifferences extends Tuple
{
    private final String 	OPEN_PRINT_DELIMINTER = "{";
    private final String 	CLOSE_PRINT_DELIMINTER = "}";

    public CellDifferences (int size, int[] newData) throws TupleException
    {
        super(size, newData);
    }
    /**
     * @return the differences between cell1 - cell0 (may be negative)
     * Note: the constructor below with modulus parameter
     *
     * @param size for CellContents (cell0 and cell1)
     * @param cell0 "lower row" before subtraction - subtrahend
     * @param cell1 "upper row" before subtraction - minuend
     * @throws Exception if size not equal size of cell0, or if size not equal
     * size of cell1
     */
    public CellDifferences(int size, CellContents cell0, CellContents cell1) throws TupleException
    {
        super(size);

        if (! (size == cell0.getTupleSize())  )
            throw new TupleException ("size incorrect for cell0");
        if (! (size == cell1.getTupleSize())  )
            throw new TupleException ("size incorrect for cell1");

        for (int i=0; i<size; i++)
        {
            int difference = cell1.getTupleComponent(i) - cell0.getTupleComponent(i);
            this.setTupleComponent(i, difference);
        }
    }
    /**
     * @return the differences between (cell1 - cell0) % modulus
     *
     *
     * @param size size for CellContents (cell0 and cell1)
     * @param cell0 cell0 "lower row" before subtraction
     * @param cell1 cell1 "upper row" before subtraction
     * @throws Exception if size not equal size of cell0, or if size not equal
     * size of cell1
     */
    public CellDifferences(int size, CellContents cell0, CellContents cell1, int modulus) throws Exception
    {
        super(size);

        if (! (size == cell0.getTupleSize())  )
            throw new Exception ("size incorrect for cell0");
        if (! (size == cell1.getTupleSize())  )
            throw new Exception ("size incorrect for cell1");

        for (int i=0; i<size; i++)
        {
            int difference = (cell1.getTupleComponent(i) - cell0.getTupleComponent(i) ) % modulus;
            this.setTupleComponent(i, difference);
        }
    }
    /**
     * The differences between two cells in a HyperSquare can be calculated using
     * cell offsets (the difference in coordinates between the cells) and a direction
     * controller.
     * <p>
     * This is similar to matrix multiplication, where a 1-by-m cell offsets is multiplied
     * by an m-by-m direction controller.  (Note: the "directions" are not the same as in
     * matrix multiplication.)
     * <P>
     * This method calculates the differences modulo the order parameter
     */
    public CellDifferences (int size, CellOffsets cellOffsets, AdjacencyMatrix adjacencyMatrix, int order) throws Exception
    {
        super (size);

        if (! (size == cellOffsets.getTupleSize()))
            throw new Exception ("size parameter not equal to cell offsets size");
        if (! (size == adjacencyMatrix.getDimensions()))
            throw new Exception ("size parameter not equal to direction controller size");

        int[][] offsetsMatrix = new int[size][size];

        for (int i=0; i<size; i++)
        {
            int[] directionControllerRow = adjacencyMatrix.getRow(i);
            int cellOffsetComponent = cellOffsets.getTupleComponent(i);
            for (int j=0; j<size; j++)
            {
                offsetsMatrix [i] [j]= cellOffsetComponent * directionControllerRow[j];
            }// for (int j=size-1; j>=0; j--)
        }// for (int j=0; j<size; j++)

        int[] differencesData = new int [size];
        for (int i=0; i<size; i++)
        {

            for (int j=0; j<size; j++)
            {
                differencesData[i] = differencesData[i] + offsetsMatrix[j][i];
            }// for (int j=0; j<size; j++
            differencesData[i] = differencesData[i] % order;
            this.setTupleComponent(i, differencesData[i] );
        }// for (int i=0; i<size; i++)
    }

    public String getOpenDelimiter()
    {
        return this.OPEN_PRINT_DELIMINTER;
    }
    public String getCloseDelimiter()
    {
        return this.CLOSE_PRINT_DELIMINTER;
    }
}
