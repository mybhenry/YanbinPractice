package yanbin.test.overload;

/**
 * Created by henrymbp on 22/10/17.
 */
public class OverLoadTestMain {
    public static void testSayHi(SuperClass testclass){
//        testclass.sayHello();
        System.out.println("SuperClass");
    }

    public static void testSayHi(SubClass testclass){
//        testclass.sayHello();
        System.out.println("SubClass");
    }

    public static void main(String[] args) {
        testSayHi(null);
    }
}
class SuperClass{
//    public void sayHello(){
//        System.out.println("SuperClass");
//    }

}
class SubClass extends SuperClass{
//    public void sayHello(){
//        System.out.println("SubClass");
//    }

}

