package yanbin.test.base64;

import java.util.Base64;

/**
 * Created by henrymbp on 17/10/17.
 */
public class Base64Test {
    public static void main(String[] args) {
        System.out.println(Base64.getEncoder().encodeToString(new byte[]{13}));// [3,16,=,=] [DQ==]
        System.out.println(Base64.getEncoder().encodeToString(new byte[]{13, 24}) );// [3,17,32,=] [DRg=]
        for(byte bt : Base64.getEncoder().encode(new byte[]{13, 24})){
            System.out.println(bt + " " + (char)bt);
        }
    }
}
