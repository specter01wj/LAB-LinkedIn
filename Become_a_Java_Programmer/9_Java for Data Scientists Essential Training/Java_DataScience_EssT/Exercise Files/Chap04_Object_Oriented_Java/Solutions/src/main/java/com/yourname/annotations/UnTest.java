package com.yourname.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Charles Kelly.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface UnTest
{
    String message();
}
