package com.yourname.string_utils_examples;


//import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/11/2016.
 */
public class PreliminaryDataTest
{

    @Test
    public void testContains()
    {
        boolean weaponsFlag = StringUtils.contains(PreliminaryData.Hamlet, "slings and arrows");
        assertTrue (weaponsFlag);
    }
}