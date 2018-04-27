package com.yourname.re.char_construct;

import com.yourname.re.PreliminaryData;
import com.yourname.re.SamplePatterns;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Charles on 10/3/2016.
 */
public class CharacterConstructTest
{
    private Pattern endAlphaPattern;
    private Matcher endAlphaMatcher;

    private Pattern musicPattern;
    private Matcher musicMatcher;

    @Before
    public void before()
    {
        endAlphaPattern = Pattern.compile(SamplePatterns.endOfAlphabetString);
        endAlphaMatcher = endAlphaPattern.matcher(PreliminaryData.typingTest);

    }
    @After
    public void after()
    {
        endAlphaPattern = null;
        endAlphaMatcher = null;
    }
    @Test
    public void testEndofAlphabetConstruct()
    {
        try
        {
            boolean findFlag = endAlphaMatcher.find();
            assertFalse(findFlag);

            if (findFlag)
            {
                String groupString = endAlphaMatcher.group();
                int startPosition = endAlphaMatcher.start();
                int endPosition = endAlphaMatcher.end();

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
    public void testNotEndofAlphabetConstruct()
    {
        try
        {
            endAlphaPattern = Pattern.compile(SamplePatterns.notEndOfAlphabetString);
            endAlphaMatcher = endAlphaPattern.matcher(PreliminaryData.typingTest);

            boolean findFlag = endAlphaMatcher.find();
            assertTrue(findFlag);

            if (findFlag)
            {
                String groupString = endAlphaMatcher.group();
                int startPosition = endAlphaMatcher.start();
                int endPosition = endAlphaMatcher.end();

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
    public void testBdRangeConstruct()
    {
        try
        {
            endAlphaPattern = Pattern.compile(SamplePatterns.bdRangeString);
            endAlphaMatcher = endAlphaPattern.matcher(PreliminaryData.typingTest);

            boolean findFlag = endAlphaMatcher.find();
            assertTrue(findFlag);

            if (findFlag)
            {
                String groupString = endAlphaMatcher.group();
                int startPosition = endAlphaMatcher.start();
                int endPosition = endAlphaMatcher.end();

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
    public void testUnionOfConsonantsConstruct()
    {
        try
        {
            endAlphaPattern = Pattern.compile(SamplePatterns.unionOfConsonantsString);
            endAlphaMatcher = endAlphaPattern.matcher(PreliminaryData.typingTest);

            boolean findFlag = endAlphaMatcher.find();
            assertTrue(findFlag);

            if (findFlag)
            {
                String groupString = endAlphaMatcher.group();
                int startPosition = endAlphaMatcher.start();
                int endPosition = endAlphaMatcher.end();

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
    public void intersectionTest()
    {
        try
        {
            Pattern hiNumberPattern = Pattern.compile("[7-9]");
            Pattern lowHiNumberPattern = Pattern.compile("[1-3]&&[7-9]]");

            boolean findFlag = false;

            Matcher hiNumberMatcher = hiNumberPattern.matcher(PreliminaryData.oldSong);
            findFlag = hiNumberMatcher.find();
            assertTrue(findFlag);

            if (findFlag)
            {
                String groupString = hiNumberMatcher.group();
                int startPosition = hiNumberMatcher.start();
                int endPosition = hiNumberMatcher.end();

                String tempString = String.format
                        (
                                "found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                                groupString,
                                startPosition,
                                endPosition
                        );
                System.out.println(tempString);
            }

            Matcher lowHiNumberMatcher = lowHiNumberPattern.matcher(PreliminaryData.oldSong);
            findFlag = lowHiNumberMatcher.find();
            assertFalse(findFlag);
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
    @Test
    public void intersectionSubtractionTest()
    {
        try
        {

            Pattern lowHiNumberPattern = Pattern.compile("[0-9&&[^7-9]]");

            boolean findFlag = false;

            Matcher lowHiNumberMatcher = lowHiNumberPattern.matcher(PreliminaryData.oldSong);

            findFlag = lowHiNumberMatcher.find();
            assertTrue(findFlag);

            if (findFlag)
            {
                String groupString = lowHiNumberMatcher.group();
                int startPosition = lowHiNumberMatcher.start();
                int endPosition = lowHiNumberMatcher.end();

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
