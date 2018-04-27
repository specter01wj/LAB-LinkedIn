package com.yourname.decorator;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/13/2016.
 */
public class RobotCarTest
{
    @Test
    public void testDriverType()
    {
        try
        {
            CarInf robotCar = new RobotCar();
            String robotCarDriver = robotCar.getDriverType();
            assertEquals("robot", StringUtils.substring(robotCarDriver, 0, 5));

            // uses method not included in Interface
            // engineering decision whether to use implementation details
            String ordinaryCarDriver = ((RobotCar)robotCar).getOrdinaryDriverType();
            assertEquals("human", StringUtils.substring(ordinaryCarDriver, 0, 5));

            String tempString = robotCar.getFavoriteSaying();
            assertTrue(StringUtils.contains( robotCar.getFavoriteSaying(), "next"));
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
}