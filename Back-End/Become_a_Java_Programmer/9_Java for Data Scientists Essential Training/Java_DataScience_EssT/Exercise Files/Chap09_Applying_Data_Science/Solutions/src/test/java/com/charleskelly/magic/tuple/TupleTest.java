package com.charleskelly.magic.tuple;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class TupleTest
{
    @Test
    public void testOrdinaryTuple()
    {
        try
        {
            int[] testData = {4, 7, -2, 0};
            Tuple testTuple = new Tuple(4, testData);
            int tupleSize = testTuple.getTupleSize();
            assertEquals(tupleSize, 4);

            int component0 = testTuple.getTupleComponent(0);
            assertEquals(component0, 4);

            int component2 = testTuple.getTupleComponent(2);
            assertEquals(component2, -2);
        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }// public void testOrdinaryTuple()
    ////////////////////////////////////////////////////////////////////////////
    @Test
    public void testAllZeroTuple()
    {
        try
        {
            int size = 5;
            Tuple testTuple = new Tuple(size);
            int tupleSize = testTuple.getTupleSize();
            assertEquals(tupleSize, size);

            for (int i=0; i<size; i++)
                assertEquals(0, testTuple.getTupleComponent(i));

        }// try
        catch (Exception e)
        {
            fail(e.toString());
        }// catch (Exception e)
    }// public void testAllZeroTuple()
    ////////////////////////////////////////////////////////////////////////////
    @Test
    public void testBadTupleSize()
    {
        try
        {
            int[] testData = {4, 7, -2, 0};
            Tuple testTuple = new Tuple(12, testData);

            fail ("should fail with incorrect tuple size");
        }// try
        catch (Exception e)
        {

        }// catch (Exception e)
    }// public void testNegativeBase()
}