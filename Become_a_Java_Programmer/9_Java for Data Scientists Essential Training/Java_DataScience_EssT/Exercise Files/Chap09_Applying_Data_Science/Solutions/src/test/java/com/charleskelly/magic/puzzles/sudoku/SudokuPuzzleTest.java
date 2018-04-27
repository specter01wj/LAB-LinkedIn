package com.charleskelly.magic.puzzles.sudoku;

import com.charleskelly.magic.TestDataConstants;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.contents.CellContents;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;
import com.charleskelly.magic.utility.MathUtility;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 9/27/2016.
 */
public class SudokuPuzzleTest
{
    private static int 				order = TestDataConstants.SUDOKU_ORDER_FOR_TESTING;
    private static int 				dimensions = TestDataConstants.SUDOKU_DIMENSIONS_FOR_TESTING;
    private static int 				modulus;
    private static int				maxHyperSquareCoordinate;
    private static Tuple            derivedPolynomialBase;

    private static SudokuPuzzle 	sudokuPuzzle;
    private static Boolean[] 		flagsArray;
    @Before
    public void setup()
    {
        try
        {
            sudokuPuzzle = new SudokuPuzzle(order, dimensions);
            modulus = MathUtility.integerExponentiation(order, dimensions);
            maxHyperSquareCoordinate = sudokuPuzzle.getMaxHyperSquareCoordinate();
            derivedPolynomialBase = sudokuPuzzle.getDerivedPolynomialBase();

            flagsArray = new Boolean[modulus];
            clearFlagsArray();
        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }

    private void clearFlagsArray()
    {
        for (int i = 0; i < flagsArray.length; i++)
        {
            flagsArray[i] = new Boolean(false);
        }// for (int i = 0; i < flagsArray.length; i++)
    }

    @Test
    public void printTwoDimensionalSudokuPuzzleOnConsole()
    {
        try
        {
            if (! (2==dimensions))
                return;
            for (int i=0; i<=maxHyperSquareCoordinate; i++)
            {
                for (int j=0; j<=maxHyperSquareCoordinate; j++)
                {
                    int[] newData = new int[2];
                    newData[0] = i;
                    newData[1] = j;
                    CellCoordinates cellCoordinates = new CellCoordinates(2, newData);
                    CellContents cellContents = sudokuPuzzle.getCellContentsFromMappedCoordinates(cellCoordinates);

                    int cellInt = cellContents.convertToInteger(derivedPolynomialBase);
                    System.out.printf("%3d", cellInt);

                }// for (int j=0; j<=maxCoordinate; j++)

                System.out.println();
            }// for (int i=0; i<=maxCoordinate; i++)
        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }
}