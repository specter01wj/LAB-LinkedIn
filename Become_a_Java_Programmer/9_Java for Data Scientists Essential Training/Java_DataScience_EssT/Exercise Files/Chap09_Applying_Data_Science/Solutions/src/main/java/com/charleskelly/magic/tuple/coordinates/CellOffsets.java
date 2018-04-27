package com.charleskelly.magic.tuple.coordinates;

import com.charleskelly.magic.tuple.Tuple;
import com.charleskelly.magic.tuple.TupleException;

/**
 * CellOffsets represent the difference between 2 CellCoordinates
 *
 * Created by Charles Kelly.
 */
public class CellOffsets extends Tuple
{
    private final String 	OPEN_PRINT_DELIMINTER = "<";
    private final String 	CLOSE_PRINT_DELIMINTER = ">";

    /**
     *
     * @param size
     * @param coordinate0
     * @param coordinate1
     * @throws Exception if size not equal size of coordinate0, or if size not equal
     * size of coordinate1
     *
     * @return an offset, each of whose components is equal to coordinate1 - coordinate0;
     * an offset component can be positive, zero, or negative
     */
    public CellOffsets(int size, CellCoordinates coordinate0, CellCoordinates coordinate1) throws TupleException
    {
        super(size);

        if (! (size == coordinate0.getTupleSize())  )
            throw new TupleException ("size incorrect for coordinate0");
        if (! (size == coordinate1.getTupleSize())  )
            throw new TupleException ("size incorrect for coordinate1");

        for (int i=0; i<size; i++)
        {
            int difference = coordinate1.getTupleComponent(i) - coordinate0.getTupleComponent(i);
            this.setTupleComponent(i, difference);
        }
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
