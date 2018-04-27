package com.yourname.reflection.person.school.method;

import com.yourname.reflection.person.school.Student;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/4/2016.
 */
public class StudentMethodsReflectionTest
{
    private Method[] methodsArray;
    private Method getGpaMethod;
    private Method setGpaMethod;
    @Before
    public void before()
    {
        Class clazz = Student.class;
        assertNotNull(clazz);
        methodsArray = clazz.getDeclaredMethods();
        assertNotNull(methodsArray);

        assertEquals(2, methodsArray.length);

        boolean getterFlag = StringUtils.contains(methodsArray[0].getName(), "get");
        if (getterFlag)
        {
            getGpaMethod = methodsArray[0];
            setGpaMethod = methodsArray[1];
        }
        else
        {
            getGpaMethod = methodsArray[1];
            setGpaMethod = methodsArray[0];
        }
    }

    @Test
    public void testReflectedMethods()
    {
        try
        {
            Student student = new Student();
            Class clazz = student.getClass();
            assertNotNull(clazz);

            getGpaMethod.setAccessible(true);
            Object originalGpaObject = getGpaMethod.invoke(student);
            Double originalGpa = (Double) originalGpaObject;
            assertEquals(0.0, originalGpa, 0.000001);


            setGpaMethod.setAccessible(true);
            Double revisedGpa = new Double (3.85);
            setGpaMethod.invoke(student, revisedGpa);
            assertEquals(3.85, revisedGpa, 0.000001);

        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }

}
