package yanbin.test.classloadinghierarchy.container.framework.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by henrymbp on 25/10/17.
 */
public class RegisteredApp {
    private String appName;
    private ClassLoader appClassLoader;
    private String serviceClassName;

    public ClassLoader getAppClassLoader() {
        if (appClassLoader == null) {
            appClassLoader = new MyAppClassLoader(ClassLoader.getSystemClassLoader(), appName);
        }
        return appClassLoader;
    }

    public void setAppClassLoader(ClassLoader appClassLoader) {
        this.appClassLoader = appClassLoader;
    }


    public String getServiceClassName() {
        return serviceClassName;
    }

    public RegisteredApp(String serviceClassName, ClassLoader appClassLoader, String appName) {
        this.appClassLoader = appClassLoader;
        this.serviceClassName = serviceClassName;
        this.appName = appName;
    }
}
