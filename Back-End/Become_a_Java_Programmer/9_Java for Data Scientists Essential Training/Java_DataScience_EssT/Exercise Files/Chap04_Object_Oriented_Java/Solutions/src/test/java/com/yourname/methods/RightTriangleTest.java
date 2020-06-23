package com.yourname.methods;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/11/2016.
 */
public class RightTriangleTest
{
    @Test
    public void testPythagorean()
    {
        RightTriangle rightTriangle = new RightTriangle(3.0, 4.0);
        rightTriangle.calculateHypotenuse();

        double calculatedHypotenuse = rightTriangle.getHypotenuse();
        assertEquals (5.0, calculatedHypotenuse, 0.00001);
    }

    @Test
    public void testStaticPythagorean()
    {
        double calculatedHypotenuse = RightTriangle.calculateHypotenuse(5.0, 12.0);
        assertEquals (13.0, calculatedHypotenuse, 0.00001);
    }
}