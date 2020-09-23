package com.bjpo;

import com.bjpo.ba01.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {


    @Test
    public void test02(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取student对象
        student myStudent =(student) ac.getBean("myStudent");
        System.out.println("student对象="+myStudent);

    }
}
