package com.charleskelly.magic.puzzles.sudoku.coordinates;

/**
 * Created by Charles on 9/27/2016.
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.charleskelly.magic.TestDataConstants;
import com.charleskelly.magic.puzzles.cubes.MagicCube;
import com.charleskelly.magic.puzzles.cubes.MagicCubeCharacteristics;
import com.charleskelly.magic.puzzles.cubes.adjacency.AdjacencyMatrix;
import com.charleskelly.magic.puzzles.cubes.pairs.CoordinatesContentsPair;
import com.charleskelly.magic.puzzles.sudoku.adjacency.SudokuAdjacencyMatrix;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;
import com.charleskelly.magic.tuple.contents.CellContents;
import com.charleskelly.magic.tuple.contents.CellDifferences;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;
import com.charleskelly.magic.utility.MathUtility;
import org.junit.Test;



public class SudokuCoordinatesTest
{
    private static int order = TestDataConstants.ORDER_FOR_TESTING_SUDOKU_LARGE_D;
    private static int dimensions = TestDataConstants.DIMENSIONS_FOR_TESTING_SUDOKU_LARGE_D;
    private static int modulus;

    private static MagicCubeCharacteristics         magicCubeCharacteristics;

    private static MagicCube                        centerMagicCube;
    private static List <CoordinatesContentsPair> 	coordinatesContentsPairList;
    private static List <CellCoordinates>			cellCoordinatesList;

    private static CellCoordinates					derivedCenterCellCoordinates;
    private static CellContents                     derivedCenterCellContents;

    private static List<CellDifferences>			cellDifferencesList;
    private static List<MagicCube>                  sudukoMagicCubeCellList;

    private static Map<CellCoordinates, MagicCube> sudokuCellsMap
                                                    = new HashMap<CellCoordinates, MagicCube> ();

    private static Map<CellCoordinates, CellContents> 		coordinatesContentsMap;

    private static Map<Tuple, Tuple> tupleTestMap = new HashMap<Tuple, Tuple>();
    ////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSudokuCoordinates()
    {
        try
        {
                //////////////////////////////////////////////
                // Create a 2 dimensional magic square
                // It will be the center of a Sudoku puzzle
                //////////////////////////////////////////////
            modulus = order;
            SudokuAdjacencyMatrix sudokuAdjacencyMatrix = new SudokuAdjacencyMatrix(dimensions);

            magicCubeCharacteristics = new MagicCubeCharacteristics (order, dimensions);
            derivedCenterCellCoordinates = magicCubeCharacteristics.getDerivedCenterCellCoordinates();
            derivedCenterCellContents = magicCubeCharacteristics.getDerivedCenterCellContents();

            centerMagicCube = new MagicCube (magicCubeCharacteristics, sudokuAdjacencyMatrix);
            coordinatesContentsMap = centerMagicCube.getCoordinatesContentsMap();

            CellCoordinates indexCellCoordinates = new CellCoordinates(dimensions, TestDataConstants.ZEROS_FOR_TESTING_SUDOKU_LARGE_D);

            int top = MathUtility.integerExponentiation(order, dimensions);
            for (int j=0; j<top; j++)
            {
                indexCellCoordinates.setTupleComponent(1, j);
                for (int i=0; i<top; i++)
                {
                    indexCellCoordinates.setTupleComponent(0, i);
                    CellCoordinates transformedCellCoordinates = transformCoordinates (indexCellCoordinates);
                    transformedCellCoordinates.rotate(i);
                    CellContents cellContents = coordinatesContentsMap.get(transformedCellCoordinates);
                    int cellValue = cellContents.convertToInteger(magicCubeCharacteristics.getDerivedPolynomialBase());
//                    System.out.print(cellValue + "\t");
                }// for (int i=0; i<top; i++)

                System.out.println();
            }// for (int j=0; j<top; j++)
        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)

    }// public void testSudokuCoordinates()

    private CellCoordinates transformCoordinates (CellCoordinates originalCoordinates) throws TupleException
    {
        int tupleSize = originalCoordinates.getTupleSize();
        CellCoordinates transformedCoordinates = new CellCoordinates(tupleSize);

        Tuple polynomialBase = magicCubeCharacteristics.getDerivedPolynomialBase();
        for (int i=0; i<tupleSize; i++)
        {
            Tuple tempTuple = MathUtility.baseForm(originalCoordinates.getTupleComponent(i), polynomialBase);

            transformedCoordinates.addToModulo(tempTuple, modulus);
        }// for (int i=0; i<tupleSize; i++)

        return transformedCoordinates;
    }


//    @Test
    public void testCreateSudoku()
    {

        for (int i=0; i<cellCoordinatesList.size(); i++)
        {
            CellCoordinates cellCoordinates = cellCoordinatesList.get(i);

            try
            {
                AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(dimensions);
                MagicCubeCharacteristics magicCubeCharacteristics = new MagicCubeCharacteristics (order, dimensions);

                MagicCube magicCube = new MagicCube (magicCubeCharacteristics, adjacencyMatrix, cellCoordinates);
                sudokuCellsMap.put(cellCoordinates, magicCube);
            }// try
            catch (Exception e)
            {
                fail(e.toString());
            }// catch (Exception e)
        }//for (int i=0; i<cellCoordinatesList.size(); i++)
    }// public void testCreateSudoku()

    @Test
    public void testPrintSudokuOnConsole()
    {
        for (int i=0; i<cellCoordinatesList.size(); i++)
        {
            CellCoordinates cellCoordinates = cellCoordinatesList.get(i);
            MagicCube magicCube = sudokuCellsMap.get(cellCoordinates);
//			System.out.println("HyperSquare: " + hyperSquare.toString());
            Map<CellCoordinates, CellContents> 	sudokuCellCoordinatesContentsMap = magicCube.getCoordinatesContentsMap();
            for (int j=0; j<cellCoordinatesList.size(); j++)
            {
                CellCoordinates specificCellCoordinates = cellCoordinatesList.get(j);
                CellContents specificCellContents = sudokuCellCoordinatesContentsMap.get(specificCellCoordinates);

                try
                {
                    int cellInt = 1 +
                            specificCellContents.convertToInteger(magicCube.getMagicCubeCharacteristics().getDerivedPolynomialBase() );
                    System.out.printf("%3d", cellInt);
                }// try
                catch(Exception e)
                {
                    fail (e.toString());
                }// catch(Exception e)

            }// for (int j=0; j<cellCoordinatesList.size(); j++)
            System.out.println();
        }// for (int i=0; i<cellCoordinatesList.size(); i++)
    }// public void testPrintSudokuOnConsole()
}// public class SudokuCoordinatesTest
