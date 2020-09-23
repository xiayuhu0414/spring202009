package com.bjpo.ba02;

public class student {
    private String name;
    private int age;
    //申明一个引用类型
    private school school;

public student(){
    System.out.println("spring会调用类的无参数构造方法创建对象");
}
/*
* 需要有set方法，没有set方法是报错的。
* Bean property 'name' is not writable or has an invalid setter method
* */

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(com.bjpo.ba02.school school) {
        this.school = school;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
