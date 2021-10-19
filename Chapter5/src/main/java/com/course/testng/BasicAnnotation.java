package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("foreMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println(" beforeClass是在类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println(" afterClass是在类之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit测试套件");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit测试套件");
    }
}
