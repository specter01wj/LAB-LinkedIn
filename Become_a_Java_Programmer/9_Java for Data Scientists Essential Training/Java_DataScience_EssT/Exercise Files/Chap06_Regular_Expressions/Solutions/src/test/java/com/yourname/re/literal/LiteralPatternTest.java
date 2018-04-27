package com.yourname.re.literal;

import com.yourname.re.PreliminaryData;
import com.yourname.re.SamplePatterns;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/3/2016.
 */

/**
 * Created by Charles on 10/3/2016.
 */
public class LiteralPatternTest
{
    private Pattern limbPattern;
    private Matcher limbMatcher;

    @Before
    public void before()
    {
        limbPattern = Pattern.compile(SamplePatterns.limbString);
        limbMatcher = limbPattern.matcher(PreliminaryData.typingTest);
    }
    @After
    public void after()
    {
        limbPattern = null;
        limbMatcher = null;
    }
    @Test
    public void testFind()
    {
        try
        {
            boolean findFlag = limbMatcher.find();
            assertTrue(findFlag);

            String groupString = limbMatcher.group();
            int startPosition = limbMatcher.start();
            int endPosition = limbMatcher.end();

            String tempString = String.format
                    (
                            "found the text" + " \"%s\" starting at " +   "index %d and ending at index %d.%n",
                            groupString,
                            startPosition,
                            endPosition
                    );
            System.out.println(tempString);
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
    @Test
    public void testReplace()
    {
        try
        {
            String extremityString = limbMatcher.replaceFirst("legs");
            boolean replacementFlag = StringUtils.contains(extremityString, "legs");
            assertTrue(replacementFlag);
            System.out.println(extremityString);
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
    @Test
    public void matchInStringTest()
    {
        try
        {
            boolean matchFlag = PreliminaryData.typingTest.matches(SamplePatterns.limbString);
            assertFalse(matchFlag);

            String typingString = new String(PreliminaryData.typingTest);
            String replacementString = typingString.replaceAll("arms", "legs");
            boolean replacementFlag = StringUtils.contains(replacementString, "legs");
            assertTrue(replacementFlag);
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
}