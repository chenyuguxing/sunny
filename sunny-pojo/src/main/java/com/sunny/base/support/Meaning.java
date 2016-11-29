package com.sunny.base.support;

import com.sunny.core.annotation.ClassInfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lijinlong on 2016/11/28.
 */
@ClassInfo(value = "业务字段含义")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Meaning {
    String value();
}
