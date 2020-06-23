package com.charleskelly.magic.puzzles.cubes;

import com.charleskelly.magic.TestDataConstants;
import com.charleskelly.magic.puzzles.cubes.adjacency.AdjacencyMatrix;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.contents.CellContents;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by Charles on 9/27/2016.
 */
public class MagicCubeTest
{
    private static int order = TestDataConstants.ORDER_FOR_TESTING;
    private static int dimensions = TestDataConstants.DIMENSIONS_FOR_TESTING;

    /**
     * "live documentation" showing how to create a magic square:
     * create an adjacency matrix and a magic cube characteristics
     */
    @Test
    public void testInstantiations()
    {
        try
        {
            AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(dimensions);
            assertNotNull(adjacencyMatrix);

            MagicCubeCharacteristics magicCubeCharacteristics = new MagicCubeCharacteristics(order, dimensions);
            assertNotNull(magicCubeCharacteristics);

            MagicCube magicCube = new MagicCube(magicCubeCharacteristics, adjacencyMatrix);
            assertNotNull(magicCube);
        }
        catch (Exception e)
        {
            fail(e.toString());
        }
    }

    @Test
    public void testPrintableMagicSquare()
    {
        try
        {
            AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(2);
            MagicCubeCharacteristics magicCubeCharacteristics = new MagicCubeCharacteristics(3, 2);
            MagicCube magicCube = new MagicCube(magicCubeCharacteristics, adjacencyMatrix);

            Tuple polynomialBase = magicCubeCharacteristics.getDerivedPolynomialBase();

            Map<CellCoordinates, CellContents> coordinatesContentsMap = magicCube.getCoordinatesContentsMap();
            Set<Map.Entry<CellCoordinates, CellContents>> magicEntrySet =   coordinatesContentsMap.entrySet();

            for (Map.Entry entry : magicEntrySet)
            {
                CellCoordinates coordinates = (CellCoordinates) entry.getKey();
                CellContents contentsAsTuple = (CellContents) entry.getValue();
                int contentsAsInt = contentsAsTuple.convertToInteger(polynomialBase);

                System.out.println(coordinates + "\t\t" + contentsAsTuple + "\t\t" + contentsAsInt);
            }


        }
        catch (Exception e)
        {
            fail(e.toString());
        }
    }
}