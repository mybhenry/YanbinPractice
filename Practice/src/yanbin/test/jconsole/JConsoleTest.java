package test.jconsole;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by henrymbp on 21/10/17.
 */
public class JConsoleTest {
    public static void main(String[] args) throws Exception {
        fillHeap(10000);
    }

    public static void fillHeap(int num) throws Exception{
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());

        }
        System.gc();
    }
}
class OOMObject{
    public byte[] placeHolder = new byte[64*1024];
}

