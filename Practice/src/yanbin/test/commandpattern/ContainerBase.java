package yanbin.test.commandpattern;

/**
 * Created by henrymbp on 18/10/17.
 */
public class ContainerBase implements Container{
    @Override
    public void saveRequestToDb(String request){
        System.out.println("Saving ["+ request +"] to database.");
    }

    @Override
    public void logRequestToFile(String request) {
        System.out.println("Logging ["+ request +"] to log file.");
    }
}
