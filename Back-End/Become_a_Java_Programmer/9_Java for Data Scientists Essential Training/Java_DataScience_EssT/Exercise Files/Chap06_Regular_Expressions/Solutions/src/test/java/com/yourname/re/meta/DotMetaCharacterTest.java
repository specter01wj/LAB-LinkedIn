package com.yourname.re.meta;

import com.yourname.re.PreliminaryData;
import com.yourname.re.SamplePatterns;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Charles on 10/3/2016.
 */
public class DotMetaCharacterTest
{
    private Pattern humanPattern;
    private Matcher humanMatcher;

    @Before
    public void before()
    {
        humanPattern = Pattern.compile(SamplePatterns.countryDotString);
        humanMatcher = humanPattern.matcher(PreliminaryData.typingTest);
    }
    @After
    public void after()
    {
        humanPattern = null;
        humanMatcher = null;
    }
    @Test
    public void testDotMetaCharacter()
    {
        try
        {
            boolean findFlag = humanMatcher.find();
            assertTrue(findFlag);

            String groupString = humanMatcher.group();
            int startPosition = humanMatcher.start();
            int endPosition = humanMatcher.end();

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
}
