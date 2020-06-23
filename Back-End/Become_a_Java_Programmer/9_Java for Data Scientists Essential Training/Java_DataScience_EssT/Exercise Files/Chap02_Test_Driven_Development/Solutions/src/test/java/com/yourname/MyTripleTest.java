package com.yourname;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/10/2016.
 */
public class MyTripleTest
{
    @Test
    /* ensure that class MyTriple is accessible and can be instantiated */
    public void testInstantiation()
    {
        MyTriple myTriple = new MyTriple();

    }

    @Test
    public void testWrongCalculation()
    {
        MyTriple myTriple = new MyTriple();
        int result = myTriple.createTriple(5);
        assertNotEquals(20, result);
    }
}