package test.gc;

/**
 * Created by henrymbp on 14/10/17.
 */
public class GCTest {
    public static void main(String[] args) {
        gctest1();
    }

    public static void gctest2(){
        int m = 1024*1024;
        byte[] b = new byte[2*m];
        byte[] b2 = new byte[2*m];
        byte[] b3 = new byte[2*m];
        byte[] b4 = new byte[2*m];
        byte[] b5 = new byte[2*m];
        byte[] b6 = new byte[2*m];
        byte[] b7 = new byte[2*m];
    }

    public static void gctest1(){
        while(true) {
            GCObj gcObj = new GCObj();
            try{
//                Thread.sleep(100L);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
class GCObj{
    private long[] a = new long[100000000];
    {
        for (int i = 0; i < a.length; i++) {
            a[i] = 123456L;
        }
    }
}