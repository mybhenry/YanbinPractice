package yanbin.test.commandpattern;

/**
 * Receiver
 * Created by henrymbp on 18/10/17.
 */
public interface Container {
    void saveRequestToDb(String request);
    void logRequestToFile(String request);

}
