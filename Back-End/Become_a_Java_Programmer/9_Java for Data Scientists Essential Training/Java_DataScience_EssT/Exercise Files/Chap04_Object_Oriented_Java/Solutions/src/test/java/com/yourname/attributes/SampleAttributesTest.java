package com.yourname.attributes;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/11/2016.
 */
public class SampleAttributesTest
{
    @Test
    public void testAttributeAccess()
    {
        SampleAttributes sampleAttributes = new SampleAttributes();

        /**
         * lastName is public; available via dot notations
         */
        assertEquals("Smith", sampleAttributes.lastName);

        /**
         * occupation is package private; class and test class located within same package
         */
        assertEquals("Data Scientist", sampleAttributes.occupation);

        /**
         * middleName is protected; available via dot notation in parent class and child class(es)
         */
        assertEquals("James", sampleAttributes.middleName);

        /**
         * firstName is private; available via getter method
         */
        assertEquals("John", sampleAttributes.getFirstName());
    }

    @Test
    public void testStaticAttributeAccess()
    {
        double myPi = Math.PI;
        assertTrue (myPi < 3.15);
        assertTrue (myPi > 3.14);
    }

    @Test
    public void testHobbyListAccess()
    {
        try
        {
            SampleAttributes sampleAttributes = new SampleAttributes();
            List<String> hobbyList = sampleAttributes.getHobbyList();
            hobbyList.add("robotics");
            fail("Shoudn't be able to access unitialized field");
        }
        catch (Exception e)
        {
            System.out.println("We must initialize an object before accessing it.");
        }
    }

    @Test
    public void testInitializedHobbyListAccess()
    {
        try
        {
            SampleAttributes sampleAttributes = new SampleAttributes();
            List<String> hobbyList = sampleAttributes.getInitializedHobbyList();
            hobbyList.add("robotics");
        }
        catch (Exception e)
        {
            fail(e.toString());
        }
    }
}