package com.yourname.flow_control;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles Kelly.
 */
public class Person
{
    private String familyName;
    protected String firstName;

    private int age;
    private AgeCategoryEnum ageCategoryEnum;

    private List<String> hobbyList = new ArrayList<String>();

    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public AgeCategoryEnum getAgeCategoryEnum()
    {
        return ageCategoryEnum;
    }

    public void setAgeCategoryEnum(AgeCategoryEnum ageCategoryEnum)
    {
        this.ageCategoryEnum = ageCategoryEnum;
    }

    public List<String> getHobbyList()
    {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList)
    {
        this.hobbyList = hobbyList;
    }
}
