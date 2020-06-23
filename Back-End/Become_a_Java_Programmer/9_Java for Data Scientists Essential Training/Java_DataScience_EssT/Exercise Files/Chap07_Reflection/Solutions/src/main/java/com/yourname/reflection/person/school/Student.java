package com.yourname.reflection.person.school;

import com.yourname.reflection.person.Person;
import com.yourname.reflection.annotations.UnTest;

/**
 * Created by Charles Kelly.
 */
@UnTest(message = "what does un testing mean?")
public class Student extends Person
{
    private double gpa; // grade point average

    public Student()
    {

    }
    public Student(String givenName, String lastName)
    {
        firstName = givenName;      // firstName in Person is protected; can access via inheritance
        setFamilyName(lastName);    // familyName in Person is private; therefore need to use setFamilyName()

        gpa = 4.0;
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
