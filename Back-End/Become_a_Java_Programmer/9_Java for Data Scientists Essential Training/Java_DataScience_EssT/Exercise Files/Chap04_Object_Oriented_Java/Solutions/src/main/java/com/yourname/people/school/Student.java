package com.yourname.people.school;

import com.yourname.people.Person;

/**
 * Created by Charles on 10/10/2016.
 */
public class Student extends Person
{
    private double gpa;

    public Student()
    {

    }

    public Student (String givenName, String familyName)
    {
        super.firstName = givenName;
        super.setFamilyName(familyName);
    }
    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
}
