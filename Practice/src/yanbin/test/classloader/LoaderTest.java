package yanbin.test.classloader;

/**
 * Created by henrymbp on 12/10/17.
 */
public class LoaderTest {
    public static void main(String[] args) throws Exception{
        MyClassLoader myClassLoader = new MyClassLoader("/Users/henrymbp/IdeaProjects/YanbinPractice/extr_class/");
        Class clazz = myClassLoader.loadClass("yanbin.test.classloader.TestTarget");
        System.out.println("class loader: "+clazz.getClassLoader());
        System.out.println("parent loader: "+ clazz.getClassLoader().getParent());

    }
}
/*
* complie class TestTarget and copy the TestTarget.class file to:
* /Users/henrymbp/IdeaProjects/GeneralTestProject/extr_class/yanbin/test/classloader
*
* then run with class name TestTarget vs TestTarget2
* */
class TestTarget2{}


