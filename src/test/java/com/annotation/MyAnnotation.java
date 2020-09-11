package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/11 14:13
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String[] value() default "unknown";
}
