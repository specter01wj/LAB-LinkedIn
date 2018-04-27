package com.yourname.flow_control;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Random;

import static com.yourname.flow_control.AgeCategoryEnum.*;
import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Charles Kelly.
 */
public class PersonTest
{
    private Person person;
    private Random random = new Random();
    @Before
    public void before()
    {
        person = new Person();
        int ageBoundary = 120;
        int age = random.nextInt(120);
        person.setAge(age);


        if (age<0)
            fail ("age can't be less than zero");
        else if ((age > 0) && (age <= 2))
            person.setAgeCategoryEnum(BABY);

            // note: age gap here; category will be UNKNOWN
        else if ((age > 4) && (age <= 8))
            person.setAgeCategoryEnum(CHILD);

        else if ((age > 8) && (age <= 12))
            person.setAgeCategoryEnum(TWEEN);

        else if ((age > 12) && (age <= 19))
            person.setAgeCategoryEnum(TEEN);

        else if ((age > 19) )
            person.setAgeCategoryEnum(ADULT);
        else
            person.setAgeCategoryEnum(UNKNOWN);

        person.getHobbyList().add("Yoga");
        person.getHobbyList().add("Swimming");
        person.getHobbyList().add("Marathons");
        person.getHobbyList().add("ScreenWriting");
        person.getHobbyList().add("Homework");
    }

    @Test
    public void testAgeCategorization()
    {
        try
        {
            String categorizationString = getCategorization(person);
            System.out.println(categorizationString);

        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }

    @Test
    public void testSwitch()
    {
        AgeCategoryEnum ageCategoryEnum = person.getAgeCategoryEnum();
        switch (ageCategoryEnum)
        {
            case BABY:
                System.out.println("Eat, Sleep, Play");
                break;
            case TWEEN:
                System.out.println("School Daze");
                break;
            case ADULT:
                System.out.println("Hi ho, hi ho, its off to work we go");
                break;
            default:
                System.out.println("What shall we do?");
        }
    }

    @Test
    public void testForEach()
    {
    hobbyLoop:
        for (String hobbyString : person.getHobbyList() )
        {
            boolean workLifeBalanceFlag = StringUtils.contains(hobbyString, "work");
            if (workLifeBalanceFlag)
            {
                System.out.println("Halt Everything: that's not a hobby!");
                break hobbyLoop;
            }
            else
            {
                System.out.println("Good choice: " + hobbyString);  // single statement in block; braces optional
            }
        }
    }

    @Test
    public void testFor()
    {
        int[] intArray;
        int size = 7;
        try
        {
            intArray = new int[size];

            for (int i= 0; i < size; i++)       // not array bounds: < not <=
                intArray[i] = 3 * i;

            for (int i= 0; i <= size; i++)
                System.out.println("array component value: " + intArray[i]);

            fail ("out of bounds exception should have been thrown");
        }
        catch (Exception e)
        {
            System.out.println("Be careful when using array boundaries !!!");
        }
    }

    @Test
    public void testWhile()
    {
        Iterator<String> hobbyListIterator = person.getHobbyList().iterator();
        while(hobbyListIterator.hasNext())
        {
            System.out.println(hobbyListIterator.next());
        }
    }
    private String getCategorization(Person person)
    {
        // Now, use the age categories
        if (UNKNOWN == person.getAgeCategoryEnum())
            return("This person has NOT been categorized");         // parenthesis optional for expression
        else
            return "This person has been categorized";
    }
}