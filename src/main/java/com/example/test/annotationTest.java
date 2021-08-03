package com.example.test;


import java.lang.annotation.*;

@test(schools = {"燕大"})
@SuppressWarnings("all")
public class annotationTest {

    public void test(){

    }
}

//定义注解可以用在什么地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//注解在神魔地方有效，一般使用运行时
@Retention(RetentionPolicy.RUNTIME)
//表示子类可以继承父类的注解
@Inherited
@interface test{
    //参数的注解：参数类型+参数名（），如果没有默认值就必须赋值
    String name() default "";
    String[] schools();

}