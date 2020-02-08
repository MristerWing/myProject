package com.gmx0807.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target
 * 어노테이션 생성 위치를 지정한다.
 * PARAMETER로 지정했으니 메소드의 피라미터로 선언된 객체에서만 사용 할 수 있다.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
