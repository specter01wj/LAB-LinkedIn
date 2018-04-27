package com.yourname.attributes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles on 10/6/2016.
 */
public class SampleAttributes
{
    public String lastName = "Smith";
    private String firstName = "John";
    protected String middleName = "James";
    String occupation = "Data Scientist";

    private List<String> hobbyList;
    private List<String> initializedHobbyList = new ArrayList<String>();

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public List<String> getHobbyList()
    {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList)
    {
        this.hobbyList = hobbyList;
    }

    public List<String> getInitializedHobbyList()
    {
        return initializedHobbyList;
    }

    public void setInitializedHobbyList(List<String> initializedHobbyList)
    {
        this.initializedHobbyList = initializedHobbyList;
    }
}
