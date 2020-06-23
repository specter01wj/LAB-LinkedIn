package com.charleskelly.magic.puzzles.cubes;

import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;
import com.charleskelly.magic.tuple.contents.CellContents;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;
import com.charleskelly.magic.utility.MathUtility;
import com.charleskelly.magic.utility.MathUtilityException;

/**
 * The class contains the "characteristics", which are sufficient to calculate
 * each cell in a MagicCube.
 *
 * Created by Charles Kelly.
 */
public class MagicCubeCharacteristics
{
    protected int			dimensions;
    protected int			order;
    private int				maximumValue;	// order^dimensions -1

    private int				derivedTotalCells;

    private Tuple           derivedPolynomialBase;

    private CellCoordinates derivedCenterCellCoordinates;
    private CellContents    derivedCenterCellContents;

    private CellCoordinates	derivedAllZerosCellCoordinates;
    private CellContents	derivedAllZerosCellContents;

    private int				derivedRowSum;

    protected String		name = "";	// displayed in UI

    /**
     *
     * @param dimensions - number of dimensions in HyperSquare; must be greater than zero
     * @param order - number of "cells" in each row or column of HyperSquare; must be odd greater than zero
     *     *
     * @throws MathUtilityException, TupleException, Exception
     */
    public MagicCubeCharacteristics(int order, int dimensions) throws MathUtilityException, TupleException, Exception
    {
        this.dimensions = dimensions;
        this.order = order;

        validateOrder(order);
        prepareCharacteristics();
    }
    public void prepareCharacteristics() throws MathUtilityException, TupleException, Exception
    {
            ////////////////////////////////////////////////////////////////////
            // calculate derived parameters
            ////////////////////////////////////////////////////////////////////
        derivedTotalCells               = MathUtility.integerExponentiation(order, dimensions);
        maximumValue                    = derivedTotalCells - 1;
        derivedPolynomialBase           = prepareDerivedPolynomialBase(order, dimensions);
        derivedCenterCellCoordinates    = prepareCenterCellCoordinates(order, dimensions);
        derivedCenterCellContents 		= prepareCenterCellContents(order, dimensions);
        derivedAllZerosCellCoordinates 	= prepareAllZerosCellCoordinates(order, dimensions);
        derivedAllZerosCellContents 	= prepareAllZerosCellContents(order, dimensions);
        derivedRowSum					= prepareRowSum();
    }

    /**
     * ensure that order is an odd number
     *
     * @throws MathUtilityException Exception if order is not odd
     */
    private void validateOrder(int order) throws MathUtilityException
    {
        int remainder = order % 2;
        if (1 != remainder)
            throw new MathUtilityException ("order is not odd: " + order);
    }

    private Tuple prepareDerivedPolynomialBase(int order, int dimensions) throws MathUtilityException, TupleException
    {
        Tuple tempTuple = new Tuple (dimensions);

        for (int k=dimensions-1; k>=0; k--)
        {
            int tempProduct = MathUtility.integerExponentiation(order,k);	// indivual component of polynomial base
            tempTuple.setTupleComponent(k, tempProduct);					// base number used for x^n +x^n-1 + ... + x^0

        }// for (int k=dimensions-1; k>=0; k++)

        return tempTuple;
    }

    private CellCoordinates prepareCenterCellCoordinates(int order, int dimensions) throws TupleException
    {
            ////////////////////////////////////////////////////////////////////
            // validator within constructor limits order to odd numbers
            ////////////////////////////////////////////////////////////////////
        int coordinateValue = (order - 1)/2;
        int[] coordinateData = new int[dimensions];
        for (int i=0; i<dimensions; i++)
            coordinateData[i] = coordinateValue;

        CellCoordinates cellCoordinates = new CellCoordinates (dimensions, coordinateData);
        return cellCoordinates;
    }

    private CellContents prepareCenterCellContents(int order, int dimensions) throws TupleException
    {
        ////////////////////////////////////////////////////////////////////
        // validator within constructor limits order to odd numbers
        ////////////////////////////////////////////////////////////////////
        int coordinateValue = (order - 1)/2;
        int[] coordinateData = new int[dimensions];
        for (int i=0; i<dimensions; i++)
            coordinateData[i] = coordinateValue;

        CellContents cellContents = new CellContents (dimensions, coordinateData);
        return cellContents;
    }

    private CellCoordinates prepareAllZerosCellCoordinates(int order, int dimensions) throws TupleException
    {
        ////////////////////////////////////////////////////////////////////
        // validator within constructor limits order to odd numbers
        ////////////////////////////////////////////////////////////////////
        int coordinateValue = (order - 1)/2;
        int[] coordinateData = new int[dimensions];
        for (int i=0; i<dimensions-1; i++)
            coordinateData[i] = coordinateValue;

        coordinateData[dimensions-1] = 0;

        CellCoordinates cellCoordinates = new CellCoordinates (dimensions, coordinateData);
        return cellCoordinates;
    }

    private CellContents prepareAllZerosCellContents(int order, int dimensions) throws TupleException
    {
        int[] coordinateData = new int[dimensions];
        for (int i=0; i<dimensions; i++)
            coordinateData[i] = 0;

        CellContents cellContents = new CellContents (dimensions, coordinateData);
        return cellContents;
    }

    private int prepareRowSum() throws TupleException, Exception
    {
        int tempSum = 0;

        int centerCellInt = this.derivedCenterCellContents.convertToInteger(this.derivedPolynomialBase);
        tempSum = centerCellInt * this.order;

        return tempSum;
    }

    public int getDimensions()
    {
        return dimensions;
    }

    public void setDimensions(int dimensions)
    {
        this.dimensions = dimensions;
    }

    public int getOrder()
    {
        return order;
    }

    public void setOrder(int order)
    {
        this.order = order;
    }

    public int getMaximumValue()
    {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }

    public int getDerivedTotalCells()
    {
        return derivedTotalCells;
    }

    public void setDerivedTotalCells(int derivedTotalCells)
    {
        this.derivedTotalCells = derivedTotalCells;
    }

    public Tuple getDerivedPolynomialBase()
    {
        return derivedPolynomialBase;
    }

    public void setDerivedPolynomialBase(Tuple derivedPolynomialBase)
    {
        this.derivedPolynomialBase = derivedPolynomialBase;
    }

    public CellCoordinates getDerivedCenterCellCoordinates()
    {
        return derivedCenterCellCoordinates;
    }

    public void setDerivedCenterCellCoordinates(CellCoordinates derivedCenterCellCoordinates)
    {
        this.derivedCenterCellCoordinates = derivedCenterCellCoordinates;
    }

    public CellContents getDerivedCenterCellContents()
    {
        return derivedCenterCellContents;
    }

    public void setDerivedCenterCellContents(CellContents derivedCenterCellContents)
    {
        this.derivedCenterCellContents = derivedCenterCellContents;
    }

    public CellCoordinates getDerivedAllZerosCellCoordinates()
    {
        return derivedAllZerosCellCoordinates;
    }

    public void setDerivedAllZerosCellCoordinates(CellCoordinates derivedAllZerosCellCoordinates)
    {
        this.derivedAllZerosCellCoordinates = derivedAllZerosCellCoordinates;
    }

    public CellContents getDerivedAllZerosCellContents()
    {
        return derivedAllZerosCellContents;
    }

    public void setDerivedAllZerosCellContents(CellContents derivedAllZerosCellContents)
    {
        this.derivedAllZerosCellContents = derivedAllZerosCellContents;
    }

    public int getDerivedRowSum()
    {
        return derivedRowSum;
    }

    public void setDerivedRowSum(int derivedRowSum)
    {
        this.derivedRowSum = derivedRowSum;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MagicCubeCharacteristics other = (MagicCubeCharacteristics) obj;
        if (name == null)
        {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString()
    {
        return "HyperSquareCharacteristics [dimensions=" + dimensions
                + ", order=" + order + ", name=" + name + "]";
    }
}
