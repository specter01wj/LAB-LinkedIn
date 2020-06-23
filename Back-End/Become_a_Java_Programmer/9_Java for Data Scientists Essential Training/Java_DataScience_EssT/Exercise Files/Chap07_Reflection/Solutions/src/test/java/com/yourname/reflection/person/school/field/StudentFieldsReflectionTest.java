package com.yourname.reflection.person.school.field;

import com.yourname.reflection.person.school.Student;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Charles Kelly.
 */
public class StudentFieldsReflectionTest
{
    @Test
    public void testForFields()
    {
        try
        {
            Class clazz = Student.class;
            assertNotNull(clazz);

            Field[] fieldsArray = clazz.getDeclaredFields();

            for (Field field : fieldsArray)
            {
                System.out.println(field.getName());
            }
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }

    @Test
    public void testSettingReflectedField()
    {
        try
        {
            Student student = new Student();
            Class clazz = student.getClass();
            assertNotNull(clazz);

            Field gpaField = clazz.getDeclaredField("gpa");

            try
            {
                gpaField.setDouble(student, 3.85);
                fail(" shouldn't be able to access private field" );
            }
            catch (Exception e)
            {
                System.out.println("No-No; don't try to access a private field");
            }

        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
}