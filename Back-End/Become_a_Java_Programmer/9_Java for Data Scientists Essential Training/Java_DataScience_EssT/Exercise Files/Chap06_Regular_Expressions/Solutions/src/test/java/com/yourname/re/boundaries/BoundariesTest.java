package com.yourname.re.boundaries;

import com.yourname.re.PreliminaryData;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Charles Kelly.
 */
public class BoundariesTest
{
    @Test
    public void testBeginningOfLine()
    {
        Pattern hamletPattern = Pattern.compile("^shocks");
        Matcher hamletMatcher = hamletPattern.matcher(PreliminaryData.Hamlet);
        boolean findFlag = hamletMatcher.find();
        assertFalse (findFlag);

        if (findFlag)
        {
            String groupString = hamletMatcher.group();
            int startPosition = hamletMatcher.start();
            int endPosition = hamletMatcher.end();

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

    @Test
    public void testEndOfLine()
    {
        // (?m) enables multi-line mode
        Pattern hamletPattern = Pattern.compile("(?m) shocks$");
        Matcher hamletMatcher = hamletPattern.matcher(PreliminaryData.Hamlet);
        boolean findFlag = hamletMatcher.find();
        assertTrue (findFlag);

        if (findFlag)
        {
            String groupString = hamletMatcher.group();
            int startPosition = hamletMatcher.start();
            int endPosition = hamletMatcher.end();

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

    @Test
    public void testBeginningAndEndOfWord()
    {
        Pattern hamletPattern = Pattern.compile(" \\bshocks\\b");
        Matcher hamletMatcher = hamletPattern.matcher(PreliminaryData.Hamlet);
        boolean findFlag = hamletMatcher.find();
        assertTrue (findFlag);

        if (findFlag)
        {
            String groupString = hamletMatcher.group();
            int startPosition = hamletMatcher.start();
            int endPosition = hamletMatcher.end();

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
}
