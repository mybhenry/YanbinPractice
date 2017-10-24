package yanbin.test.commandpattern;

/**
 * Client
 * Created by henrymbp on 18/10/17.
 */
public class Server {
    public static void main(String[] args) {
        Connector conn = new HttpConnector();
        Container container = new ContainerBase();

        Processor saveToDb = new DatabaseProcessor(container);
        Processor logToFile = new LogProcessor(container);

        conn.processRequest(saveToDb, "request 1");
        conn.processRequest(logToFile, "request 2");
        conn.processRequest(saveToDb, "request 3");
        conn.processRequest(saveToDb, "request 4");
        conn.processRequest(logToFile, "request 1");
        conn.processRequest(saveToDb, "request 2");
        conn.processRequest(logToFile, "request 1");
        conn.processRequest(logToFile, "request 5");
        conn.processRequest(logToFile, "request 2");

        conn.printHistory();

    }
}
