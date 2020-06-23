package com.yourname.reflection.person.school.constructors;

import com.yourname.reflection.person.school.Student;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import static org.junit.Assert.*;

/**
 * Created by Charles on 10/4/2016.
 */
public class StudentConstructorsReflectionTest
{
    private Constructor[] constructorsArray;
    private Constructor noArgumentConstructor;

    private Method[] methodsArray;
    private Method getGpaMethod;
    private Method setGpaMethod;
    @Before
    public void before()
    {
        Class clazz = Student.class;
        assertNotNull(clazz);

        constructorsArray = clazz.getDeclaredConstructors();
        assertNotNull(constructorsArray);
        assertEquals(2, constructorsArray.length);

        boolean failureFlag = true;
    constructorSearchLoop:
        for(Constructor constructor : constructorsArray)
        {
            Parameter[] parametersArray = constructor.getParameters();
            if (0 == parametersArray.length)
            {
                noArgumentConstructor = constructor;
                failureFlag = false;
                break constructorSearchLoop;
            }
        }
        if(failureFlag)
            fail ("did not find no argument constructor");

        noArgumentConstructor = constructorsArray[0];
    }
    @Test
    public void testInstantiateViaReflection()
    {
        try
        {
            Student student = (Student) noArgumentConstructor.newInstance();
            Class clazz = student.getClass();
            assertNotNull(clazz);

            getReflectedMethods(clazz);

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

    private void getReflectedMethods(Class clazz)
    {
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
}
