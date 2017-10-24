package yanbin.test.commandpattern;

/**
 * Created by henrymbp on 18/10/17.
 */
public class DatabaseProcessor implements Processor{
    private Container container;

    public DatabaseProcessor(Container container) {
        this.container = container;
    }

    @Override
    public void processRequest(String arg) {
        container.saveRequestToDb(arg);
    }
}
