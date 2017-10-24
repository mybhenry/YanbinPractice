package yanbin.test.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by henrymbp on 12/10/17.
 */
class MyClassLoader extends ClassLoader{
    private String path = null;

    public MyClassLoader(String path){
        this.path = path;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            File file = new File(path + "/"+name.replace(".","/") + ".class");
            InputStream ins = new FileInputStream(file);
            byte[] data = new byte[(int)file.length()];
            ins.read(data);
            Class clazz =  defineClass(name, data, 0, data.length);
            return clazz;
        }catch (Exception e) {
            e.printStackTrace();
            ClassNotFoundException cnfe = new ClassNotFoundException();
            cnfe.initCause(e);
            throw cnfe;
        }
    }

}