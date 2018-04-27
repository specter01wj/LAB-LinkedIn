package com.yourname.constructors.sample_static;

/**
 * Created by Charles Kelly.
 */
public final class SampleStatic
{
    private SampleStatic()
    {
        // inhibit instantiation
    }

    public static double piSquared()
    {
        return Math.pow(Math.PI, 2.0);
    }

    public static double eSquared()
    {
        return Math.pow(Math.E, 2.0);
    }
}
