package com;

import yanbin.test.classloadinghierarchy.container.framework.api.IApp;
/*
 * Created by henrymbp on 23/10/17.
 */
public class AppImpl1 implements IApp {
    public static void main(String[] args) {
        System.out.println("sdf");
    }
    @Override
    public void service(){
        System.out.println("App1 new behavior Service in AppImpl1. ClassLoader: "+this.getClass().getClassLoader());
        System.out.println("IApp ClassLoader: "+IApp.class.getClassLoader());
        System.out.println("Util ClassLoader: "+Util.class.getClassLoader());

    }
}
