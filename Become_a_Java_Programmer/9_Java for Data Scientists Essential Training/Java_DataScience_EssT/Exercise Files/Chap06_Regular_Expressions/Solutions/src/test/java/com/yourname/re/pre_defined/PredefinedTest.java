package com.yourname.re.pre_defined;

import com.yourname.re.PreliminaryData;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Charles on 10/3/2016.
 */
public class PredefinedTest
{
    @Test
    public void testPredefinedDigits()
    {
        try
        {
            Pattern digitPattern = Pattern.compile("\\d");  // note 2 back slash characters; due to Java escape character
            Matcher digitMatcher = digitPattern.matcher(PreliminaryData.oldSong);
            boolean findFlag = digitMatcher.find();
            assertTrue (findFlag);

            if (findFlag)
            {
                String groupString = digitMatcher.group();
                int startPosition = digitMatcher.start();
                int endPosition = digitMatcher.end();

                String tempString = String.format
                        (
                                "found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                                groupString,
                                startPosition,
                                endPosition
                        );
                System.out.println(tempString);
            }
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }

    @Test
    public void testWord()
    {
        try
        {
            Pattern whiteSpacePattern = Pattern.compile("\\w");
            Matcher whiteSpaceMatcher = whiteSpacePattern.matcher(PreliminaryData.typingTest);
            boolean findFlag = whiteSpaceMatcher.find();
            assertTrue (findFlag);

            if (findFlag)
            {
                String groupString = whiteSpaceMatcher.group();
                int startPosition = whiteSpaceMatcher.start();
                int endPosition = whiteSpaceMatcher.end();

                String tempString = String.format
                        (
                                "found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                                groupString,
                                startPosition,
                                endPosition
                        );
                System.out.println(tempString);
            }
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }

    @Test
    public void testNonWord()
    {
        try
        {
            Pattern whiteSpacePattern = Pattern.compile("\\W");
            Matcher whiteSpaceMatcher = whiteSpacePattern.matcher(PreliminaryData.typingTest);
            boolean findFlag = whiteSpaceMatcher.find();
            assertTrue (findFlag);

            if (findFlag)
            {
                String groupString = whiteSpaceMatcher.group();
                int startPosition = whiteSpaceMatcher.start();
                int endPosition = whiteSpaceMatcher.end();

                String tempString = String.format
                        (
                                "found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                                groupString,
                                startPosition,
                                endPosition
                        );
                System.out.println(tempString);
            }
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
}
