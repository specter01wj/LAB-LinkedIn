package com.yourname.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class PrintQueueAccessorTest
{
    @Test
    public void testInstantiation()
    {
        boolean firstResult = PrintQueueAccessor.isPrintQueueInstantiated();
        assertFalse(firstResult);

        PrintQueueAccessor.writeToQueue("silly string");
        boolean secondResult = PrintQueueAccessor.isPrintQueueInstantiated();
        assertTrue(secondResult);
    }
}