package yanbin.test.classloadinghierarchy.container.framework.core;

import yanbin.test.classloadinghierarchy.container.framework.api.IApp;

/**
 * Created by henrymbp on 24/10/17.
 */
public class AppRunner implements Runnable{
    private String appClassName;

    public AppRunner(String appClassName) {
        this.appClassName = appClassName;
    }

    @Override
    public void run() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Class appClass = Class.forName(appClassName, true, classLoader);
            IApp app = (IApp)appClass.newInstance();
            System.out.println("app: " + app);
            app.service();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }
}
