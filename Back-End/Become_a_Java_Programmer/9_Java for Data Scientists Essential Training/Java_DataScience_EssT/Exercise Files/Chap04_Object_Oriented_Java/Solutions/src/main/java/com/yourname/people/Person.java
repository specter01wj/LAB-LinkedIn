package com.yourname.people;

/**
 * Created by Charles Kelly.
 */
public class Person
{
    private String familyName = "Smith";
    protected String firstName = "Mary";

    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }
}
