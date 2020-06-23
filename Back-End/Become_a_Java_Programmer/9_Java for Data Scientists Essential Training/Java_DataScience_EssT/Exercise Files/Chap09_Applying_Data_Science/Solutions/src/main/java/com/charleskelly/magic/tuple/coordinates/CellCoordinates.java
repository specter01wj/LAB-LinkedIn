package com.charleskelly.magic.tuple.coordinates;

import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;

/**
 * Created by Charles Kelly.
 */
public class CellCoordinates extends Tuple
{
    private final String 	OPEN_PRINT_DELIMINTER = "[";
    private final String 	CLOSE_PRINT_DELIMINTER = "]";

    public CellCoordinates(int size) throws TupleException
    {
        super(size);
    }
    public CellCoordinates(int size, int[] newData) throws TupleException
    {
        super(size, newData);
    }
    public String getOpenDelimiter()
    {
        return this.OPEN_PRINT_DELIMINTER;
    }
    public String getCloseDelimiter()
    {
        return this.CLOSE_PRINT_DELIMINTER;
    }
}
