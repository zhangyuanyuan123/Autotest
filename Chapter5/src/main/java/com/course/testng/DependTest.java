package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public  void  test1(){
       // throw new RuntimeException();

    }
    //如何依赖的方法执行失败了，本方法被忽略
    @Test(dependsOnMethods = {"test1"})
    public  void  test2(){
        System.out.println("test2 run");

    }
}