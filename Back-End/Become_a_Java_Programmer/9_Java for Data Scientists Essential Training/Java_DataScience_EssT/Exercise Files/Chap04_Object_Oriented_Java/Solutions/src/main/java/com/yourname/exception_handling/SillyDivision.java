package com.yourname.exception_handling;

/**
 * Created by Charles Kelly.
 */
public class SillyDivision
{
    private double numerator;
    private double denominator;
    private double quotient;

    public SillyDivision(double numerator, double denominator)
    {
        this.numerator = numerator;
        sillySubstitution();
    }

    private void sillySubstitution()
    {
        this.denominator = 0.0;
    }

    public double calculateQuotient() throws Exception
    {
        try
        {
            quotient = numerator / denominator;
            if (quotient == Double.POSITIVE_INFINITY)
                throw new Exception();
            if (quotient == Double.NEGATIVE_INFINITY)
                throw new Exception();
            return quotient;
        }
        catch (Exception e)
        {
            throw new Exception ("probably used a Silly denominator");
        }
        finally
        {
            // finally block not needed here; used only for illustration
            System.out.println("Are we finally finished with this silly example? ");
        }
    }
}
