package yanbin.test.classloadinghierarchy.container.framework.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * Created by henrymbp on 23/10/17.
 */
public class MyAppClassLoader extends URLClassLoader{

    private static URL[] generateJarURLs(String appFolder)   {
        File appDir = new File("/Users/henrymbp/IdeaProjects/YanbinPractice/extr_class/yanbin/test/classloadinghierarchy/container/apps/"+ appFolder);
        System.out.println("appDir:"+appDir);
        File[] jarFiles = appDir.listFiles();
        List<URL> urlList = new java.util.ArrayList<>();
        for (File jarFile :jarFiles) {
            if(jarFile.getName().endsWith(".jar")) {
                System.out.println("jarFile:" + jarFile);
                URL jarURL = null;
                try {
                    jarURL = jarFile.toURL();
                }catch (MalformedURLException e){}
                if (jarURL != null)
                    urlList.add(jarURL);
            }
        }
        return urlList.toArray(new URL[0]);
    }

    public MyAppClassLoader(ClassLoader parentClassLoader, String appFolder) {
        super(generateJarURLs(appFolder), parentClassLoader);
    }
}
