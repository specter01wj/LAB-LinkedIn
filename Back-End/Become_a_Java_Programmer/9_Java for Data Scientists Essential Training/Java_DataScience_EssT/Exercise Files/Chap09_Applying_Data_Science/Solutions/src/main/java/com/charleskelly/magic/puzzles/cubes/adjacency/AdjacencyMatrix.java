package com.charleskelly.magic.puzzles.cubes.adjacency;

/**
 * Given a cell within a magic square, an adjacency matrix calculates the value of an adjacent cell.
 * An adjacency matrix can also be used to calculate the value of a non-adjacent cell via 'multiplication'
 *
 * Created by Charles on Kelly.
 */
public class AdjacencyMatrix
{
    private int dimensions;
    private int[][] matrix;

    public AdjacencyMatrix(int dimensions)
    {
        this.dimensions = dimensions;
        matrix = new int[this.dimensions][this.dimensions];
        prepareAdjacencyMatrix();
    }

    public AdjacencyMatrix(int[][] matrix)
    {
        this.matrix = matrix;
        int matrixSize = matrix.length;
        this.dimensions = matrixSize;

        prepareAdjacencyMatrix();
    }

    private void prepareAdjacencyMatrix()
    {
        for (int i=0; i<dimensions; i++)
        {
            for (int j=0; j<dimensions; j++)
            {
                if ((i + j) > (dimensions - 2))
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = -1;
            }
        }
    }

    public int[] getRow(int index) throws Exception
    {
        if (index < 0)
            throw new Exception ("index is less than zero: " + index);
        if (index > this.dimensions)
            throw new Exception ("index is greater than dimensions: " + index);

        return matrix[index];
    }
    public int getDimensions()
    {
        return dimensions;
    }

    public void setDimensions(int dimensions)
    {
        this.dimensions = dimensions;
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    public void setMatrix(int[][] matrix)
    {
        this.matrix = matrix;
    }
}
