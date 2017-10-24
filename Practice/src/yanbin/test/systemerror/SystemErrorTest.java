package yanbin.test.systemerror;

import static java.lang.System.err;

/**
 * Created by henrymbp on 18/10/17.
 */
public class SystemErrorTest {
    public static void main(String[] args) {
        try{
            int a = 15/0;
        }catch(Exception e){
//            e.printStackTrace(err);
            e.printStackTrace();// the same as printStackTrace(err);
        }
    }
}
