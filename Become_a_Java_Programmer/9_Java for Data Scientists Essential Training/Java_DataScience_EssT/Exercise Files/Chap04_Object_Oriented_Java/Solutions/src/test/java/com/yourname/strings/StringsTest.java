package com.yourname.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class StringsTest
{
    @Test
    public void testSimpleStrings()
    {
        String string01 = "Java";

        String string02 = new String ("Java");

        char data[] = {'J', 'a', 'v', 'a'};
        String string03 = new String(data);

        assertEquals(string01, string02);

        boolean stringEqualityFlag01 = (string01 == string02);
        assertFalse(stringEqualityFlag01);

        boolean stringEqualityFlag02 = string01.equals(string02);
        assertTrue(stringEqualityFlag02);
    }

    @Test
    public void testImmutability()
    {
        String string01 = "LinkedIn Learning";

        string01 = "LinkedIn Learning" + "via Lynda.com";

        /**
         * The concatenation operation changed the memory location where string01 is stored within the JVM
         *
         * If you would like to find the memory locations, see this article: http://stackoverflow.com/questions/8820164/is-there-a-way-to-get-a-reference-address
         *
         */

    }
    @Test
    public void testUsingStringBuffer()
    {
        StringBuffer stringBuffer = new StringBuffer("Now ");
        stringBuffer.append("is ");
        stringBuffer.append("the ");
        stringBuffer.append("time");

        String constructedString = stringBuffer.toString();
        assertEquals("Now is the time", constructedString);
    }
}
