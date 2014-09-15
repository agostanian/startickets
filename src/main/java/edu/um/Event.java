package edu.um;

/**
 * Created by alan on 15/09/14.
 */
public class Event {
    public Event(String name,String type) {

        this.type=type;

        this.name=name;
        this.fromCache = false;

    }

    public String name;

    public String type;

    public boolean fromCache;
}
