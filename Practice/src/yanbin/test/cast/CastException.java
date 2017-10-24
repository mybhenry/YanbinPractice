package yanbin.test.cast;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by henrymbp on 11/10/17.
 */
public class CastException {
    public static Map m= new HashMap();
    static {

        m = new HashMap(){{
            put("a", "2");
        }};
        System.out.println(m);
    }


    public static void main(String[] args) throws Exception {

        System.out.println(m.get("a"));

    }
}

