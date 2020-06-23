package com.yourname.people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/10/2016.
 */
public class PersonTest
{
    private Person person;

    @Before
    public void before()
    {
        person = new Person();
    }
    @Test
    public void attemptToUseHiddenFieldTest()
    {
        try
        {
//            System.out.println(person.familyName);
            System.out.println(person.getFamilyName());
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
}