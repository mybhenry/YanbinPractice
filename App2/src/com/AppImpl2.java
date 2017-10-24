package com;

import yanbin.test.classloadinghierarchy.container.framework.api.IApp;

/**
 * Created by henrymbp on 23/10/17.
 */
public class AppImpl2 implements IApp {
    @Override
    public void service(){

        System.out.println("=_Service in AppImpl2. ClassLoader: "+this.getClass().getClassLoader());
        System.out.println("IApp ClassLoader: "+IApp.class.getClassLoader());
        System.out.println("Util ClassLoader: "+Util.class.getClassLoader());

    }
}
