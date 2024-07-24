package com.ymbj.ordertest.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//ConditionalOnLinux注解上用了@Conditional，而LinuxCondition implements Condition，所以被@ConditionalOnLinux注解的类会被LinuxCondition的matches()方法判断
@Conditional(LinuxCondition.class)
public @interface ConditionalOnLinux {
	// 标注是哪个环境
	String environment() default "";

}
