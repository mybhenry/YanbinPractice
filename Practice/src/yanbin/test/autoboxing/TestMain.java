package yanbin.test.autoboxing;

/**
 * Created by henrymbp on 22/10/17.
 */
public class TestMain {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        /*below code are in the compiled class file*/
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(c.intValue() == a.intValue() + b.intValue());
//        System.out.println(c.equals(Integer.valueOf(a.intValue() + b.intValue())));
//        System.out.println(g.longValue() == (long)(a.intValue() + b.intValue()));
//        System.out.println(g.equals(Integer.valueOf(a.intValue() + b.intValue())));



    }
}
