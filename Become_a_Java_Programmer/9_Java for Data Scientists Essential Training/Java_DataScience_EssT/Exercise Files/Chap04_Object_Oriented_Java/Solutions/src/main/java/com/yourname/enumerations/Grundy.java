package com.yourname.enumerations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Poem Solomon Grundy: https://en.wikipedia.org/wiki/Solomon_Grundy
 * Created by Charles Kelly.
 */
public class Grundy
{
    /**
     * Note: in production we would not use two separate data structures.
     *
     * This is for teaching purposes only.
     */


    // see: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
    private List<EventHolder> solomonsEventList = new ArrayList();

    // see: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
    public Map<DaysEnum, String> solomonsMap = new HashMap();

    public Grundy()
    {
        EventHolder eventHolder00 = new EventHolder(DaysEnum.UNKNOWN, "Did Solomon truly exist?");
        solomonsEventList.add(eventHolder00);
        solomonsMap.put(DaysEnum.UNKNOWN, "Did Solomon truly exist?");

        EventHolder eventHolder01 = new EventHolder(DaysEnum.MONDAY, "Born");
        solomonsEventList.add(eventHolder01);
        solomonsMap.put(DaysEnum.MONDAY, "Born");

        EventHolder eventHolder02 = new EventHolder(DaysEnum.TUESDAY, "Christened");
        solomonsEventList.add(eventHolder02);
        solomonsMap.put(DaysEnum.TUESDAY, "Christened");

        EventHolder eventHolder03 = new EventHolder(DaysEnum.WEDNESDAY, "Married");
        solomonsEventList.add(eventHolder03);
        solomonsMap.put(DaysEnum.WEDNESDAY, "Married");

        EventHolder eventHolder04 = new EventHolder(DaysEnum.THURSDAY, "Took Ill");
        solomonsEventList.add(eventHolder04);
        solomonsMap.put(DaysEnum.THURSDAY, "Took Ill");
    }

    public List<EventHolder> getSolomonsEventList()
    {
        return solomonsEventList;
    }

    public String getSolomonsDailyEvent(DaysEnum daysEnum)
    {
        return solomonsMap.get(daysEnum);
    }
}
