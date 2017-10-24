package yanbin.yanbin.test.deflatercompress;

import java.io.*;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.*;
/**
 * Created by henrymbp on 17/10/17.
 */
public class CompressTest {
    public static void main(String[] args) throws IOException {
        String inputString = "This is the original testing string. Hello world. string. string. string. string. string";
        try {
            // Encode a String into bytes
            byte[] input = inputString.getBytes("UTF-8");

            // Compress the bytes
            byte[] output = new byte[1000];
            Deflater compresser = new Deflater();
            compresser.setInput(input);
            compresser.finish();
            int compressedDataLength = compresser.deflate(output);
            compresser.end();

            System.out.println(compressedDataLength);

            // Decompress the bytes
            Inflater decompresser = new Inflater();
            decompresser.setInput(output, 0, compressedDataLength);
            byte[] result = new byte[1000];
            int resultLength = decompresser.inflate(result);
            decompresser.end();

            System.out.println(resultLength);


            // Decode the bytes into a String
            String outputString = new String(result, 0, resultLength, "UTF-8");
            System.out.println(outputString);
        } catch(java.io.UnsupportedEncodingException ex) {
            // handle
        } catch (java.util.zip.DataFormatException ex) {
            // handle
        }

        String source = inputString;
        System.out.println("before compress length:" + source.getBytes().length);
        String comsed = compress(source);
        System.out.println("after compress length:" + comsed.getBytes().length);
        String uncom = unCompress(comsed);
        System.out.println(uncom);


    }

    private static String compress(String source) {
        try {
            ByteArrayOutputStream bos = null;
            bos = new ByteArrayOutputStream();
            DeflaterOutputStream dos = new DeflaterOutputStream(bos);
            dos.write(source.getBytes());
            dos.close();
            String compress = new sun.misc.BASE64Encoder().encode(bos.toByteArray());
//            String compress = Base64.getEncoder().encodeToString(bos.toByteArray());
            return compress;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String unCompress(String comped) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] compress = new sun.misc.BASE64Decoder().decodeBuffer(comped);
//            byte[] compress = Base64.getDecoder().decode(comped);

            ByteArrayInputStream bis = new ByteArrayInputStream(compress);
            InflaterInputStream inflater = new InflaterInputStream(bis);
            byte[] b = new byte[1024];
            int count;
            while ((count = inflater.read(b)) >= 0) {
                out.write(b, 0, count);
            }
            inflater.close();
            return new String(out.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
