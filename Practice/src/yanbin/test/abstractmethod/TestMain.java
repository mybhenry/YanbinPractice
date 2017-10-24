package yanbin.test.abstractmethod;

/**
 * Created by henrymbp on 22/10/17.
 */
public class TestMain {

    public static void main(String[] args) {
//        new SubClass().test();
//        InterfaceSubClass.test2();
        InterfaceClass.test2();
    }
}

class SuperClass {
    public  static void test(){
        System.out.println("inside SuperClass");
    }

}
interface InterfaceClass{
    public static void test2(){
        System.out.println("inside InterfaceClass");
    }
}

interface InterfaceSubClass extends InterfaceClass{
}

abstract class SubClass extends SuperClass implements InterfaceClass{

}
