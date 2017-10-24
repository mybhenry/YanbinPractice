package yanbin.test.cast;

import java.util.HashMap;

/**
 * Created by henrymbp on 12/10/17.
 */
class MyHashMap extends HashMap {
    {
        System.out.println("Init block");
        put("a", "2");
    }

    @Override
    public Object get(Object key) {
        return super.get(key);
    }
}
