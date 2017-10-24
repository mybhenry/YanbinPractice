package yanbin.test.classloadinghierarchy;

import yanbin.test.classloadinghierarchy.container.framework.core.ContainerCore;

import java.util.Scanner;

/**
 * Created by henrymbp on 23/10/17.
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        ContainerCore containerCore =  new ContainerCore();
       while (true){
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           if (str.startsWith("deploy")) {
               String[] names = str.split("\\|");
               containerCore.deploy(names[1], names[2]);
           }else if (str.startsWith("undeploy")) {
               String[] names = str.split("\\|");
               containerCore.undeploy(names[1]);
           }else{
               containerCore.dispatchService(str);
           }
       }

    }
}
