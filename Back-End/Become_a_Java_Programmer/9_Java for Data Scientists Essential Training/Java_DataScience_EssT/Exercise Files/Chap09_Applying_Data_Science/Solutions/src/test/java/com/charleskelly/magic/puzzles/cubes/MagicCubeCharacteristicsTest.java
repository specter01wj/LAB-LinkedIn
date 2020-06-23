package com.charleskelly.magic.puzzles.cubes;

import com.charleskelly.magic.TestDataConstants;
import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.contents.CellContents;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 9/27/2016.
 */
public class MagicCubeCharacteristicsTest
{
    private static int order = TestDataConstants.ORDER_FOR_TESTING;
    private static int dimensions = TestDataConstants.DIMENSIONS_FOR_TESTING;

    @Test
    public void testMagicCubeCharacteristics()
    {
        try
        {
            MagicCubeCharacteristics MagicCubeCharacteristics = new MagicCubeCharacteristics (order, dimensions);
            int derivedTotalCells = MagicCubeCharacteristics.getDerivedTotalCells();
            assertEquals (TestDataConstants.DERIVED_TOTAL_CELLS, derivedTotalCells);

            Tuple derivedPolynomialBase = MagicCubeCharacteristics.getDerivedPolynomialBase();
            Tuple anticipatedDerivedPolynomialBase = new Tuple (dimensions, TestDataConstants.DERIVED_POLYNOMIAL_BASE_ARRAY);
            assertEquals(anticipatedDerivedPolynomialBase, derivedPolynomialBase);

            int derivedRowSum = MagicCubeCharacteristics.getDerivedRowSum();
            assertEquals(TestDataConstants.DERIVED_ROW_SUM, derivedRowSum );
        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }

    @Test
    public void testCenterCellValue()
    {
        try
        {
            MagicCubeCharacteristics MagicCubeCharacteristics = new MagicCubeCharacteristics (order, dimensions);
            Tuple derivedPolynomialBase = MagicCubeCharacteristics.getDerivedPolynomialBase();
            CellContents derivedCenterCellContents = MagicCubeCharacteristics.getDerivedCenterCellContents();
            int centerCellInt = derivedCenterCellContents.convertToInteger(derivedPolynomialBase);
            assertEquals(TestDataConstants.DERIVED_CENTER_CELL, centerCellInt);
        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }
}