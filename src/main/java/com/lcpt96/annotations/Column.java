package com.lcpt96.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface Column {

	String name() default "";

	int length() default 0;

	boolean nullable() default true;

	boolean unique() default false;

}
