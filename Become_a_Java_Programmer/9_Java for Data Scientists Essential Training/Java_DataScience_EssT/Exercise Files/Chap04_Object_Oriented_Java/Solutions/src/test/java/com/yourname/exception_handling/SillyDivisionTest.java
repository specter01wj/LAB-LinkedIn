package com.yourname.exception_handling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class SillyDivisionTest
{
    @Test
    public void testSillyDivision() throws Exception
    {
        try
        {
            SillyDivision sillyDivision = new SillyDivision(16, 5);
            double quotient = sillyDivision.calculateQuotient();
            fail ("shouldn't get here");
        }
        catch (Exception e)
        {
//             sometimes you will want to rethrow an Exception; after you catch it for debugging purposes
            System.out.println("not handling an error here.");
            throw new Exception (" should have caught this");
        }
    }
}