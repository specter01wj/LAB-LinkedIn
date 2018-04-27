package com.charleskelly.magic.puzzles.sudoku.adjacency;

import com.charleskelly.magic.puzzles.cubes.adjacency.AdjacencyMatrix;

/**
 * Created by Charles on 9/27/2016.
 */
public class SudokuAdjacencyMatrix extends AdjacencyMatrix
{
    /**
     * Provides future separation between AdjacencyMatrix for magic squares and
     * AdjacencyMatrix for Sudoku puzzles
     *
     * @author Charlie Kelly
     *
     */

    public SudokuAdjacencyMatrix(int dimensions)
    {
        super(dimensions);
    }
    public SudokuAdjacencyMatrix(int[][] matrix)
    {
        super(matrix);
    }
}
