package com.yourname.enumerations;

/**
 * Created by Charles Kelly.
 */
public class EventHolder
{
    private DaysEnum daysEnum;
    private String event;

    public EventHolder()
    {

    }

    public EventHolder (DaysEnum daysEnum, String event)
    {
        this.daysEnum = daysEnum;
        this.event = event;
    }
    public DaysEnum getDaysEnum()
    {
        return daysEnum;
    }

    public void setDaysEnum(DaysEnum daysEnum)
    {
        this.daysEnum = daysEnum;
    }

    public String getEvent()
    {
        return event;
    }

    public void setEvent(String event)
    {
        this.event = event;
    }
}
