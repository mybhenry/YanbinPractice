package yanbin.test.observerpattern;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by henrymbp on 18/10/17.
 */
public class TestMain {
    public static void main(String[] args) {
        Event event = new Event(new Date());
        event.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if(o != null && o instanceof Event){
                    System.out.println("Event is updated. logging the action.");
                }

            }
        });
        event.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if(o != null && o instanceof Event){
                    System.out.println("Event is updated. notifying remote system.");
                }

            }
        });
        event.setEventDate(new Date());

    }
}
