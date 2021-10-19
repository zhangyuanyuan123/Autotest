package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProviderTest {
    @Test(dataProvider = "data")
    public void  testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerDate(){
        Object[][] o=new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",40}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public  void test1(String name,int age){
        System.out.println("test1方法 name="+name+";age="+age);

    }
    @Test(dataProvider = "methodData")
    public  void test2(String name,int age){
        System.out.println("test2方法 name="+name+";age="+age);

    }
    @DataProvider(name="methodData")
    public  Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",43434},
                    {"lisi",939232}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"zhangsan",1},
                    {"lisi",2}
            };

        }
         return result;
    }
}
