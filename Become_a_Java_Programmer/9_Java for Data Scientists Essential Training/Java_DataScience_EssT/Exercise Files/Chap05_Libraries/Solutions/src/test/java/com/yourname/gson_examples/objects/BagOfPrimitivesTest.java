package com.yourname.gson_examples.objects;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/11/2016.
 */
public class BagOfPrimitivesTest
{
    private Gson gson;

    @Before
    public void before()
    {
        gson = new Gson();
    }
    @Test
    public void testBagOfPrimitives()
    {
        BagOfPrimitives bagOfPrimitives01 = new BagOfPrimitives();
        String bagOfPrimitives01String = gson.toJson(bagOfPrimitives01);
        System.out.println(bagOfPrimitives01String);

        BagOfPrimitives retrievedBagOfPrimitives = gson.fromJson(bagOfPrimitives01String, BagOfPrimitives.class);
        boolean retrievalFlag = bagOfPrimitives01.equals(retrievedBagOfPrimitives);
        assertNotNull (retrievedBagOfPrimitives);
        assertTrue(retrievedBagOfPrimitives instanceof BagOfPrimitives);
    }
}