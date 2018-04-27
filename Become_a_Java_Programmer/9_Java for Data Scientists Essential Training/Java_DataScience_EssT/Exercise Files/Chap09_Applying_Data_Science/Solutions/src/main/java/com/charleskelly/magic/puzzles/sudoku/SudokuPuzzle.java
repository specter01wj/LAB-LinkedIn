package com.charleskelly.magic.puzzles.sudoku;

import com.charleskelly.magic.puzzles.cubes.MagicCube;
import com.charleskelly.magic.puzzles.cubes.MagicCubeCharacteristics;
import com.charleskelly.magic.puzzles.sudoku.adjacency.SudokuAdjacencyMatrix;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.contents.CellContents;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;
import com.charleskelly.magic.utility.MathUtility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Charles on 9/27/2016.
 */
public class SudokuPuzzle
{
    private int order;
    private int dimensions;
    private int modulus;
    private int sukokuOrder;
    private int maxSudokuCoordinate;	    // maximum value for any "mapped" coordinate
    private int	maxHyperSquareCoordinate;	// maximum coordinate within a hyper square, which is part of a Sudoku puzzle
    private List<CellCoordinates> cellCoordinatesKeysList;
    private Tuple derivedPolynomialBase;

    private Map<CellCoordinates, MagicCube> sudokuPartsMap = new HashMap<CellCoordinates, MagicCube>();

    private MagicCube centerMagicCube;
    private CellCoordinates	derivedCenterCellCoordinates;



    public SudokuPuzzle (int order, int dimensions) throws Exception
    {
        this.order = order;
        this.dimensions = dimensions;

        try
        {
            modulus = MathUtility.integerExponentiation(order, dimensions);
            sukokuOrder = MathUtility.integerExponentiation(order, dimensions-1);
            this.maxSudokuCoordinate = (modulus) - 1;
            SudokuAdjacencyMatrix sudokuAdjacencyMatrix = new SudokuAdjacencyMatrix(dimensions);
            MagicCubeCharacteristics magicCubeCharacteristics = new MagicCubeCharacteristics (sukokuOrder, dimensions);
            centerMagicCube = new MagicCube (magicCubeCharacteristics, sudokuAdjacencyMatrix);
            derivedPolynomialBase = centerMagicCube.getMagicCubeCharacteristics().getDerivedPolynomialBase();
            derivedCenterCellCoordinates = magicCubeCharacteristics.getDerivedCenterCellCoordinates();
            cellCoordinatesKeysList = centerMagicCube.getCellCoordinatesKeysList();

            sudokuPartsMap.put(derivedCenterCellCoordinates, centerMagicCube);
            iteratedCellCoordinatesLoop:
            for (int i=0; i<cellCoordinatesKeysList.size(); i++)
            {
                CellCoordinates cellCoordinates = cellCoordinatesKeysList.get(i);
                if (cellCoordinates.equals(derivedCenterCellCoordinates))
                    continue iteratedCellCoordinatesLoop;

                Tuple offsetTuple = calculateOffset(derivedCenterCellCoordinates, cellCoordinates);
                MagicCube magicCube = new MagicCube (magicCubeCharacteristics, sudokuAdjacencyMatrix, offsetTuple);
                sudokuPartsMap.put(cellCoordinates, magicCube);
            }// for (int i=0; i<cellCoordinatesKeysList.size(); i++)
        }// try
        catch (Exception e)
        {
            throw new Exception(e);
        }// catch (Exception e)
    }

    private Tuple calculateOffset(CellCoordinates derivedCenterCellCoordinates, CellCoordinates iteratedCellCoordinates) throws Exception
    {
        Tuple offsetTuple = Tuple.difference(derivedCenterCellCoordinates, iteratedCellCoordinates);
        return offsetTuple;
    }

    public CellContents getCellContentsFromMappedCoordinates(CellCoordinates cellCoordinates) throws Exception
    {
        int quotient, remainder;

        int[] tupleData = cellCoordinates.getTupleData();
        int[] sudokuPartTupleData = new int [tupleData.length];
        int[] hyperSquareTupleData = new int [tupleData.length];
        for (int i=0; i<tupleData.length; i++)
        {
            int tupleDatum = tupleData[i];
            if (tupleDatum < 0)
                throw new Exception ("cell coordinate: " + i + " is less than zero: " + tupleDatum);
            if (tupleDatum > maxSudokuCoordinate)
                throw new Exception ("cell coordinate: " + i + " is greater than maxCoordinate: " + tupleDatum + "\t" + cellCoordinates);

            quotient = tupleDatum / order;
            remainder = tupleDatum % order;

            sudokuPartTupleData[i] = remainder;
            hyperSquareTupleData[i] = remainder;
        }// for (int i=0; i<tupleData.length; i++)

        CellCoordinates sudokuPartCellCoordinates = new CellCoordinates(tupleData.length, sudokuPartTupleData);
        CellCoordinates hyperSquareCellCoordinates = new CellCoordinates(tupleData.length, hyperSquareTupleData);

        MagicCube magicCube = this.sudokuPartsMap.get(sudokuPartCellCoordinates);
        CellContents retrievedCellCoordinates = magicCube.getCoordinatesContentsMap().get(hyperSquareCellCoordinates);

        return retrievedCellCoordinates;
    }

    public int getOrder()
    {
        return order;
    }

    public int getDimensions()
    {
        return dimensions;
    }

    public int getModulus()
    {
        return modulus;
    }

    public int getSukokuOrder()
    {
        return sukokuOrder;
    }

    public int getMaxSudokuCoordinate()
    {
        return maxSudokuCoordinate;
    }

    public int getMaxHyperSquareCoordinate()
    {
        return maxHyperSquareCoordinate;
    }

    public List<CellCoordinates> getCellCoordinatesKeysList()
    {
        return cellCoordinatesKeysList;
    }

    public Tuple getDerivedPolynomialBase()
    {
        return derivedPolynomialBase;
    }

    public Map<CellCoordinates, MagicCube> getSudokuPartsMap()
    {
        return sudokuPartsMap;
    }

    public MagicCube getCenterMagicCube()
    {
        return centerMagicCube;
    }

    public CellCoordinates getDerivedCenterCellCoordinates()
    {
        return derivedCenterCellCoordinates;
    }
}
