package com.yourname.constructors;

/**
 * Created by Charles on 10/6/2016.
 */
public class RightTriangle extends Triangle
{
    public RightTriangle (double base, double height)
    {
        super(base, height, 90.0);
        super.base = base;
        this.height = height;
    }

    public void calculateHypotenuse()
    {
        double baseSquared = Math.pow(base, 2.0);
        double heightSquared = Math.pow(height, 2.0);
        double hypotenuseSquared = baseSquared + heightSquared;

        hypotenuse = Math.sqrt(hypotenuseSquared);
    }

    public static double calculateHypotenuse(double base, double height)
    {
        double baseSquared = Math.pow(base, 2.0);
        double heightSquared = Math.pow(height, 2.0);
        double hypotenuseSquared = baseSquared + heightSquared;

        double calculatedHypotenuse = Math.sqrt(hypotenuseSquared);

        return calculatedHypotenuse;
    }
}
