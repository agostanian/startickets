package edu.um;

/**
 * Created by alan on 15/09/14.
 */
import java.util.ArrayList;
import java.util.List;


public class Cache {
    private List<Event> events;

    public void save(List<Event> events){
        this.events = events;
    }

    public List<Event> loadEvents(){
        if (events == null){
            events = new ArrayList<Event>();
        }
        return events;
    }
}
