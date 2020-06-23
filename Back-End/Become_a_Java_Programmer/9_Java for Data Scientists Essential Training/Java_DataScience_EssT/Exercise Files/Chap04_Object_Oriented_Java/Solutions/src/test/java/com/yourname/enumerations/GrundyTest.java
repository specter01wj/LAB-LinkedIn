package com.yourname.enumerations;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class GrundyTest
{
    private Grundy grundy;
    @Before
    public void before()
    {
        grundy = new Grundy();
    }
    @Test
    public void testSolomonsList()  //example of "live documentation"; no assert statements
    {
        Grundy grundy = new Grundy();
        List<EventHolder> solomonsEventList = grundy.getSolomonsEventList();
        for (EventHolder eventHolder : solomonsEventList) {
            DaysEnum daysEnum = eventHolder.getDaysEnum();
            String event = eventHolder.getEvent();
            System.out.println(daysEnum + "\t\t" + event + "\t\t" + daysEnum.ordinal());
        }
    }

    @Test
    public void testSolomonsMap()
    {
        String event = grundy.getSolomonsDailyEvent(DaysEnum.FRIDAY);
        assertNull(event);

        event = grundy.getSolomonsDailyEvent(DaysEnum.MONDAY);
        assertEquals("Born", event);
    }
}