package com.bjpo.service.impl;

import com.bjpo.service.Some;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SomeImpl implements Some {
    public SomeImpl(){
        System.out.println("无参数构造方法");
    }
    @Override
    public void doSome() {
        System.out.println("执行了方法");
    }
}
