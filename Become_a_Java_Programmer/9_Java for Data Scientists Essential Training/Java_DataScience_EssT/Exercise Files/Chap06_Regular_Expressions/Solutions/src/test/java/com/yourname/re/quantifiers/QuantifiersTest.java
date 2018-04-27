package com.yourname.re.quantifiers;

import com.yourname.re.PreliminaryData;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Charles on 10/4/2016.
 */
public class QuantifiersTest
{
    private String searchPattern = "o.";
    @Test
    public void testOneOrMoreGreedy()
    {
        Pattern zeroOnePattern = Pattern.compile("("  + searchPattern +   ")+");
        Matcher zeroOneMatcher = zeroOnePattern.matcher(PreliminaryData.oldSong);

        boolean findFlag = false;
        while (zeroOneMatcher.find() )
        {
            String groupString = zeroOneMatcher.group();
            int startPosition = zeroOneMatcher.start();
            int endPosition = zeroOneMatcher.end();

            String tempString = String.format
                    (
                            "Greedy found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                            groupString,
                            startPosition,
                            endPosition
                    );
            System.out.println(tempString);
        }
    }

    @Test
    public void testOneOrMoreReluctant()
    {
        Pattern zeroOnePattern = Pattern.compile("("  + searchPattern +   ")+?");
        Matcher zeroOneMatcher = zeroOnePattern.matcher(PreliminaryData.oldSong);

        boolean findFlag = false;
        while (zeroOneMatcher.find() )
        {
            String groupString = zeroOneMatcher.group();
            int startPosition = zeroOneMatcher.start();
            int endPosition = zeroOneMatcher.end();

            String tempString = String.format
                    (
                            "Reluctant found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                            groupString,
                            startPosition,
                            endPosition
                    );
            System.out.println(tempString);
        }
    }
    @Test
    public void testOneOrMorePossessive()
    {
        Pattern zeroOnePattern = Pattern.compile("("  + searchPattern +   ")++");
        Matcher zeroOneMatcher = zeroOnePattern.matcher(PreliminaryData.oldSong);

        boolean findFlag = false;
        while (zeroOneMatcher.find() )
        {
            String groupString = zeroOneMatcher.group();
            int startPosition = zeroOneMatcher.start();
            int endPosition = zeroOneMatcher.end();

            String tempString = String.format
                    (
                            "Possessive found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
                            groupString,
                            startPosition,
                            endPosition
                    );
            System.out.println(tempString);
        }
    }
}
