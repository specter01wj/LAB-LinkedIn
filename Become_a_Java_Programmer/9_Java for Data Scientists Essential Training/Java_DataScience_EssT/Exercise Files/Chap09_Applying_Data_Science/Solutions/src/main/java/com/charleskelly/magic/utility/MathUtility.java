package com.charleskelly.magic.utility;

import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;

/**
 * Created by Charles Kelly.
 */
public class MathUtility
{
    /**
     *
     * @param base must be greater than or equal zero
     * @param exponent must be greater than or equal zero
     * @return base^^exponent
     *
     * @throws MathUtilityException
     */
    public static int integerExponentiation(int base, int exponent) throws MathUtilityException
    {
        if (base < 0)
            throw new MathUtilityException ("base is less than or equal to zero: " + base);
        if (exponent < 0)
            throw new MathUtilityException ("exponent is less than or equal to zero: " + base);
        ////////////////////////////////////////////////////////////////////////
        int result = base;

        if (0 == exponent)
        {
            result = 1;
            return result;
        }// if (0 == exponent)
        ////////////////////////////////////////////////////////////////////
        // We will calculate the result by multiplying the base by itself,
        // exponent number of times
        ////////////////////////////////////////////////////////////////////
        for (int i = 1; i < exponent; i++)
        {
            result = result * base;
        }// for (int i = 1; i < exponent; i++)

        return result;
    }// public static int integerExponentiation(int base, int exponent) throws TupleException
    ////////////////////////////////////////////////////////////////////////////
    /**
     * based upon algorithm from http://www.cis.temple.edu/~ingargio/cis67/code/RandomPermutation.java
     *
     * @return an array of integers in the range 0..size - 1; randomized with respect to order
     */
    public static int[] randomPermutation(int size) throws Exception
    {
        if (1 > size)
            throw new MathUtilityException ("size parameter is less than 1: " + size);
        ////////////////////////////////////////////////////////////////////
        int[] orderedArray 		= new int[size];
        int[] randomizedArray;
        ////////////////////////////////////////////////////////////////////
        // create ordered array with contents 0..n-1
        ////////////////////////////////////////////////////////////////////
        for (int i=0; i<size; i++)
            orderedArray[i] = i;
        ////////////////////////////////////////////////////////////////////
        // clone the ordered array as a starting point for randomized array
        ////////////////////////////////////////////////////////////////////
        randomizedArray = orderedArray.clone();
        ////////////////////////////////////////////////////////////////////
        // randomize
        ////////////////////////////////////////////////////////////////////
        for (int i=size-1; i>0; i--)
        {
            int randomPosition = (int)Math.floor(Math.random() * (i+1));
            int temp = randomizedArray[randomPosition];
            ////////////////////////////////////////////////////////////////
            // At each iteration of the loop, swap the the number at the i-th
            // position with a number at a random position
            ////////////////////////////////////////////////////////////////
            randomizedArray [randomPosition] = randomizedArray[i];
            randomizedArray [i] = temp;
        }// for (int i=size-1; i>0; i--)
        ////////////////////////////////////////////////////////////////////
        return randomizedArray;
    }// public static int[] randomPermutation(int size) throws Exception
    ////////////////////////////////////////////////////////////////////////////
    public static Tuple baseForm (int value, Tuple polynomialBase)throws TupleException
    {
        int tupleSize = polynomialBase.getTupleSize();
        Tuple baseFormTuple = new Tuple (tupleSize);

        int quotient=0, remainder=value;

        for (int index=tupleSize - 1; index >= 0; index --)
        {
            quotient = remainder / polynomialBase.getTupleComponent(index);
            remainder = remainder % polynomialBase.getTupleComponent(index);

            baseFormTuple.setTupleComponent(index, quotient);
        }// for (int index=tupleSize - 1; index >= 0; index --)

        return baseFormTuple;
    }// public static Tuple baseForm (int value, Tuple polynomialBase)throws TupleException
    ////////////////////////////////////////////////////////////////////////////
    public static int addModulo(int first, int second, int modulus)
    {
        int sum = first + second;
        int result = sum % modulus;

        return result;
    }// public static int addModulo(int first, int second, int modulus)
}
