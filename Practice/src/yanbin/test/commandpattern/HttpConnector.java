package yanbin.test.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by henrymbp on 18/10/17.
 */
public class HttpConnector implements Connector{
    private List<Processor> history = new ArrayList<>();
    @Override
    public void processRequest(Processor processor, String arg) {
        history.add(processor);
        processor.processRequest(arg);
    }
    public void printHistory(){
        System.out.println("======HISTORY======");
        for (Processor processor: history) {
            System.out.println(processor.getClass().getSimpleName());
        }
    }

}
