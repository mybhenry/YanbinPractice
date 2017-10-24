package yanbin.test.classloadinghierarchy.container.framework.core;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by henrymbp on 23/10/17.
 */
public class ContainerCore {
    private Map<String,RegisteredApp> registeredApps = Collections.synchronizedMap(new HashMap<>());
    {
        registeredApps.put("app1", new RegisteredApp("com.AppImpl1",null, "app1"));
        registeredApps.put("app2", new RegisteredApp("com.AppImpl2",null, "app2"));
    }
    public void undeploy(String appName){
        registeredApps.remove(appName);
        System.out.println(appName +" is undeployed.");
    }

    public void deploy(String appName, String className){
        registeredApps.put(appName, new RegisteredApp(className,null, appName));
        System.out.println(appName +" is deployed with class "+ className);
    }


    public void dispatchService(String appName) throws Exception {
        RegisteredApp registeredApp = registeredApps.get(appName);
        if(registeredApp == null){
            System.out.println("app not found: "+ appName);
            return;
        }

        ClassLoader myAppClassLoader = registeredApp.getAppClassLoader();
        registeredApp.setAppClassLoader(myAppClassLoader);
        Thread thread = new Thread(new AppRunner(registeredApp.getServiceClassName()));
        thread.setContextClassLoader(myAppClassLoader);
        thread.start();
    }

}
