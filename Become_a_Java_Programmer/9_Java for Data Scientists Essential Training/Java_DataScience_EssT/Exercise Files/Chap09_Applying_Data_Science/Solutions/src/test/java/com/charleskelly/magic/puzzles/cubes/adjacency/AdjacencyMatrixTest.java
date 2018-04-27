package com.charleskelly.magic.puzzles.cubes.adjacency;

import com.charleskelly.magic.TestDataConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.charleskelly.magic.TestDataConstants.DIMENSIONS_FOR_TESTING;
import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class AdjacencyMatrixTest
{
    private static int order = TestDataConstants.ORDER_FOR_TESTING;
    private static int dimensions = DIMENSIONS_FOR_TESTING;

    private static AdjacencyMatrix adjacencyMatrix;

    @Before
    public void setup()
    {
        adjacencyMatrix = new AdjacencyMatrix(DIMENSIONS_FOR_TESTING);
    }
    @After
    public void tearDown()
    {
        adjacencyMatrix = null;
    }

    @Test
    public void testAdjacencyMatrix()
    {
        assertEquals (dimensions, adjacencyMatrix.getDimensions() );
        assertTrue(adjacencyMatrix.getMatrix() instanceof int[][]);
    }
    @Test
    /*
    AdjacencyMatrix should only contain 1 or -1
     */
    public void testUnits()
    {
        int unit = 0;
        int[] [] matrix = adjacencyMatrix.getMatrix();

        for (int i=0; i<dimensions; i++)
        {
            for (int j=0; j<dimensions; j++)
            {
                unit = matrix[i][j];
                assertTrue ( (1==unit) || (-1==unit));
            }
        }
    }
}