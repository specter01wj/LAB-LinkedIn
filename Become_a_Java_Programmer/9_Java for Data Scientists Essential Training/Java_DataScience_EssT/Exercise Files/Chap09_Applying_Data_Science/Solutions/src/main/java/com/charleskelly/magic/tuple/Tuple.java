package com.charleskelly.magic.tuple;

import com.charleskelly.magic.utility.MathUtility;

import java.util.Arrays;

/**
 The class Tuple is the basic data structure for each cell in a Hyper Cube.
 If a Hyper Cube has d dimensions, then each cell in the Hyper Cube is represented
 by one object of class Tuple.  Each Tuple object will contain d numbers.
 The range for these numbers is 0..RowSize.
 RowSize is the "order" of the Hyper Cube.

 * Created by Charles Kelly.
 */
public class Tuple implements Comparable<Tuple>
{
    private final String 	OPEN_PRINT_DELIMINTER = "(";
    private final String 	CLOSE_PRINT_DELIMINTER = ")";

    private int     tupleSize;
    private int[]   tupleData;
    /**
     * Instantiate a new tuple with all components equal to zero
     */
    public Tuple (int size)
    {
        tupleSize = size;
        tupleData = new int [tupleSize];
        for (int k = 0; k<tupleSize; k++)
        {
            tupleData [k] = 0;
        }
    }
    /**
     * Instantiate new tuple with data contained in parameter newData
     * <br>
     * Although it is possible to derive size from newData.length, in practice
     * during calculation of magic squares, these data might come from different
     * sources
     *
     * @param size size of Tuple to be created
     *
     * @param newData data used to fill the Tuple
     *
     * @throws Exception if size != newData.length
     */
    public Tuple (int size, int[] newData) throws TupleException
    {                                                   // needs error checking if newData is "too small"
        tupleSize = newData.length;
        tupleData = new int [tupleSize];

        if (size != newData.length)
            throw new TupleException ("size parameter does not equal newData.length");
        ////////////////////////////////////////////////////////////////////////
        for (int k = 0; k<tupleSize; k++)
        {
            tupleData [k] = newData[k];
        }// for (int k = 0; k<tupleSize; k++)
    }
    public void showTuple ()
    {
        for (int i=0; i<tupleSize; i++)
        {
            System.out.print(tupleData[i]+ ",  ");
        }// for (int i=0; i<tupleSize; i++)

        System.out.println(" ");
    }
    public int getTupleComponent (int index) throws TupleException
    {
        if (index < 0)
            throw new TupleException ("index is less than zero: " + index);
        if (index >= tupleSize)
            throw new TupleException ("index is >= tupleSize; index: " + index + " tupleSize: " + tupleSize);

        return tupleData [index];
    }
    public void setTupleComponent (int index, int new_value) throws TupleException
    {
        if (index < 0)
            throw new TupleException ("index is less than zero: " + index);
        if (index >= tupleSize)
            throw new TupleException ("index is >= tupleSize; index: " + index + " tupleSize: " + tupleSize);

        tupleData [index] = new_value;
    }
    public int convertToInteger (Tuple base_Tuple) throws Exception
    {
        int result = 0;
        for (int k=0; k < tupleSize; k++)
        {
            result = result + tupleData [k] * base_Tuple.getTupleComponent(k);
        }// for (int k=0; k < tupleSize; k++)

        return result;
    }
    /**
     * @return (top - bottom) for each Tuple component
     *
     * @throws TupleException if top and bottom have different sizes
     */
    public static Tuple difference(Tuple top, Tuple bottom) throws TupleException
    {
        Tuple tempTuple = null;
        int topSize = top.tupleSize;
        int bottomSize = bottom.tupleSize;

        if ( ! (topSize == bottomSize))
            throw new TupleException ("size for top and bottom are not the same");

        int [] dataHolder = new int [topSize];

        for (int i=0; i<topSize; i ++)
            dataHolder[i] = top.getTupleComponent(i) - bottom.getTupleComponent(i);

        tempTuple = new Tuple (topSize, dataHolder);
        return tempTuple;
    }
    /**
     * @return (top - bottom) for each Tuple component modulo the value in modulus parameter
     *
     * @throws TupleException if top and bottom have different sizes
     */
    public static Tuple difference(Tuple top, Tuple bottom, int modulus) throws TupleException
    {
        Tuple tempTuple = null;
        int topSize = top.tupleSize;
        int bottomSize = bottom.tupleSize;

        if ( ! (topSize == bottomSize))
            throw new TupleException ("size for top and bottom are not the same");

        int [] dataHolder = new int [topSize];

        for (int i=0; i<topSize; i ++)
            dataHolder[i] = (top.getTupleComponent(i) - bottom.getTupleComponent(i)) % modulus;

        tempTuple = new Tuple (topSize, dataHolder);
        return tempTuple;
    }
    /**
     * adds the components of otherTuple to the components of this Tuple, modulo the modulus
     * @param otherTuple
     * @param modulus
     * @throws TupleException
     */
    public void addToModulo(Tuple otherTuple, int modulus) throws TupleException
    {
        int otherTupleSize = otherTuple.getTupleSize();
        if (!(otherTupleSize == this.tupleSize))
            throw new TupleException ("Tuples have different sizes");

        int tempSum = 0;
        for (int i=0; i<otherTupleSize; i++)
        {
            tempSum = MathUtility.addModulo(this.getTupleComponent(i), otherTuple.getTupleComponent(i), modulus);
            this.setTupleComponent(i, tempSum);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public Tuple reverse() throws TupleException
    {
        Tuple tempTuple = new Tuple(this.getTupleSize());

        int oldIndex = this.getTupleSize() - 1;
        int newIndex = 0;

        for (int index = oldIndex; index >= 0; index --)
        {
            int tempValue = this.getTupleComponent(index);
            tempTuple.setTupleComponent(newIndex, tempValue);
            newIndex ++;
        }// for (int index = oldIndex; index >= 0; index --)

        return tempTuple;
    }
    public void rotate(int rotationCount) throws TupleException
    {
        if (rotationCount < 0)
            throw new TupleException ("rotationCount parameter is negative");

        int[] tempTupleData = new int[this.tupleSize];
        int remainder = rotationCount % this.tupleSize;

        int index = 0;
        for (int i = this.tupleSize-1; i>=0; i--)
        {
            index = i - remainder;
            if (index < 0)
                index = this.tupleSize + index;

            tempTupleData[index] = this.tupleData[i];
        }// for (int i = this.tupleSize-1; i>=0; i--)

        this.tupleData = tempTupleData;
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(tupleData);
        result = prime * result + tupleSize;
        return result;
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Tuple))
            return false;
        Tuple other = (Tuple) obj;
        if (!Arrays.equals(tupleData, other.tupleData))
            return false;
        if (tupleSize != other.tupleSize)
            return false;
        return true;
    }
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        String closeDelimiter = getCloseDelimiter();
        String openDelimiter = getOpenDelimiter();

        sb.append(openDelimiter);

        boolean multipleComponentFlag = false;
        for (int i=0; i<this.tupleSize; i++)
        {
            if (multipleComponentFlag)
                sb.append(", ");
            sb.append(this.tupleData[i]);
            multipleComponentFlag = true;
        }// for (int i=0; i<this.tupleSize; i++)

        sb.append(closeDelimiter);

        String tempString = sb.toString();
        return tempString;
    }
    public String getOpenDelimiter()
    {
        return this.OPEN_PRINT_DELIMINTER;
    }
    public String getCloseDelimiter()
    {
        return this.CLOSE_PRINT_DELIMINTER;
    }
    /**
     * @return the tupleSize
     */
    public int getTupleSize()
    {
        return tupleSize;
    }
    /**
     * @return the tupleData
     */
    public int[] getTupleData()
    {
        return tupleData;
    }
    public int compareTo(Tuple otherTuple)
    {
        int sizeComparison = this.tupleSize - otherTuple.getTupleSize();
        if (! (0 == sizeComparison))
            return sizeComparison;

        int dataComparison = 0;
        try
        {
            for (int i = 0; i<this.tupleSize; i++)
            {
                dataComparison = this.getTupleComponent(i) - otherTuple.getTupleComponent(i);
                if (! (0 == dataComparison))
                    return dataComparison;
            }// for (int i = 0; i<this.tupleSize; i++)
        }// try
        catch (Exception e)
        {
            return 0;
        }// catch (Exception e)

        return 0;
    }
}
