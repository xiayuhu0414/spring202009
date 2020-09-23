package com.bjpo;
import com.bjpo.service.Some;
import com.bjpo.service.impl.SomeImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class mytest {

    @Test
    public void test01(){
        Some sv = new SomeImpl();
        sv.doSome();
    }
/*
* spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中的所有对象。
* spring创建对象：默认调用的是无参数构造方法
* */
    @Test
    public void test02(){
        //使用spring容器创建对象
        //1.指定spring配置文件的名称
        String config="beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过容器获取对象了
        //ClassPathxmlApplicationContext：表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，你要调用对象的方法
        //getBean（"id的值"）
        Some sv = (Some) ac.getBean("se1");
        //使用spring创建好的对象
        sv.doSome();
    }
    /*
    * 获取spring容器中java对象的信息
    * */
    @Test
    public void test3(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量："+nums);
        //容器中每个定义的对象的名称
        String names[] = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }

    }
    //获取一个非自定义的类对象
    @Test
    public void test4(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量："+nums);
        //使用getBean()
        Date my = (Date) ac.getBean("mydate") ;
            System.out.println("Date:"+my);


    }
}
