package com.yourname.reflection.person.school.annotations;

import com.yourname.reflection.annotations.UnTest;
import com.yourname.reflection.person.school.Student;
import org.junit.Test;

import java.lang.annotation.Annotation;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Charles Kelly.
 */
public class StudentAnnotationReflectionTest
{
    @Test
    public void testFindAnnotations()
    {
        Class clazz = Student.class;
        assertNotNull(clazz);

        Annotation[] annotationsArray = clazz.getAnnotations();

        for (Annotation annotation : annotationsArray)
        {
            String annotationString = annotation.toString();
            System.out.println(annotationString);
            if (annotation instanceof UnTest)
            {
                UnTest unTest = (UnTest) annotation;
                String message = unTest.message();
                System.out.println(message);
            }
        }

    }
}
