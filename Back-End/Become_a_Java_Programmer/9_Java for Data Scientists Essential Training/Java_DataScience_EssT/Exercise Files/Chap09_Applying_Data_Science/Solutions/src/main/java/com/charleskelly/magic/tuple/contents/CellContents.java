package com.charleskelly.magic.tuple.contents;

import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;

/**
 * CellContents represent the data contained within a cell of a multi-dimensional
 * matrix
 *
 * Created by Charles Kelly.
 */
public class CellContents extends Tuple
{
    private final String 	OPEN_PRINT_DELIMINTER = "{";
    private final String 	CLOSE_PRINT_DELIMINTER = "}";

    public CellContents(int size, int[] newData) throws TupleException
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
