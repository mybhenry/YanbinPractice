package yanbin.test.observerpattern;

import java.util.Date;
import java.util.Observable;
import java.util.Scanner;
/**
 * Created by henrymbp on 18/10/17.
 */
public class Event extends Observable {

    private Date eventDate;

    public Event(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        setChanged();
        notifyObservers();
        this.eventDate = eventDate;
    }
}
