package com.yourname.primitives;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/11/2016.
 */
public class SamplePrimitivesTest
{
    @Test
    public void testSampleDataTypes()
    {
        try
        {
            SamplePrimitives samplePrimitives = new SamplePrimitives();

            samplePrimitives.setSampleByte((byte) 12000);
            System.out.println(samplePrimitives.getSampleByte());
            assertNotEquals(12000, samplePrimitives.getSampleByte() );

            int demoInt = 12000;
            samplePrimitives.setSampleInt(demoInt);
            assertEquals (2 * demoInt, demoInt + samplePrimitives.getSampleInt());

            Double demoDouble = new Double(123.45);
            samplePrimitives.setSampleDouble(demoDouble);
            assertTrue(samplePrimitives.getSampleDouble() > 123);   // intentionally mixed test with Double and 123
        }
        catch (Exception e)
        {
            fail (e.toString() );
        }
    }
}