package yanbin.test.commandpattern;

/**
 * Invoker
 * Created by henrymbp on 18/10/17.
 */
public interface Connector {
    void processRequest(Processor processor, String arg);
    void printHistory();
}
