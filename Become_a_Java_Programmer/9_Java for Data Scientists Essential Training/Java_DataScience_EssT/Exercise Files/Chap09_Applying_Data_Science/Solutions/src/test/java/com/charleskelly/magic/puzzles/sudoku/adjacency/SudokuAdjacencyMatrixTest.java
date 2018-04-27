package com.charleskelly.magic.puzzles.sudoku.adjacency;

import com.charleskelly.magic.TestDataConstants;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 9/27/2016.
 */
public class SudokuAdjacencyMatrixTest
{
    private static int order = TestDataConstants.SUDOKU_ORDER_FOR_TESTING;
    private static int dimensions = TestDataConstants.SUDOKU_DIMENSIONS_FOR_TESTING;

    @Test
    public void testInstantiateSudokuAdjacencyMatrix()
    {
        try
        {
            SudokuAdjacencyMatrix sudokuAdjacencyMatrix = new SudokuAdjacencyMatrix(dimensions);
            assertEquals (dimensions, sudokuAdjacencyMatrix.getDimensions());
            assertTrue ( (sudokuAdjacencyMatrix.getMatrix() instanceof int[][]) );

            int derivedDimensions = sudokuAdjacencyMatrix.getDimensions();
            assertEquals(dimensions, derivedDimensions);


        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }
}