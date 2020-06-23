package com.yourname.gson_examples.primitives;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Charles on 10/11/2016.
 */
public class GsonPrimitivesTest
{
    private Gson gson;

    @Before
    public void before()
    {
        gson = new Gson();
    }
    @Test
    public void testGsonPrimitive()
    {
        int one = 1;
        String oneString = gson.toJson(one);
        int retrievedOne = gson.fromJson(oneString, int.class);
        assertTrue (one == retrievedOne);

        Long ten = new Long(10);
        String longString = gson.toJson(ten);
        Long retrievedLong = gson.fromJson(longString, Long.class);
        assertTrue (ten.equals(retrievedLong));
    }
}
