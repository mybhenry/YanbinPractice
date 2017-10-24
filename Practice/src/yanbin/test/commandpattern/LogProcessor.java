package yanbin.test.commandpattern;

/**
 * Created by henrymbp on 18/10/17.
 */
public class LogProcessor implements Processor{
    private Container container;

    public LogProcessor(Container container) {
        this.container = container;
    }

    @Override
    public void processRequest(String arg) {
        container.logRequestToFile(arg);
    }
}
