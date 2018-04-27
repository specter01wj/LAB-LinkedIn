package com.yourname.constructors;

/**
 * Created by Charles on 10/6/2016.
 */
public class Triangle
{
    protected double base;
    protected double height;
    protected double hypotenuse;

    protected double includedAngle; // angle between base and hypotenuse

    public Triangle (double base, double height, double includedAngle)
    {
        this.base = base;
        this.height = height;
        this.includedAngle = includedAngle;
    }

    public double getHypotenuse()
    {
        return hypotenuse;
    }
}
