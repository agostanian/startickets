package edu.um;

/**
 * Created by alan on 15/09/14.
 */
import java.util.ArrayList;
import java.util.List;

public class EventManagerCacheDecorator {
    Cache cache;
    EventManager eventManager;

    public EventManagerCacheDecorator(EventManager eventManager){
        this.eventManager = eventManager;
        this.cache = new Cache();
    }

    public Event getEventByName(String name) {

        // busca el evento en la base de datos

        // para este ejercicio devolvemos en evento fijo simulando el acceso a base de datos
        Event event;

        List<Event> events = this.cache.loadEvents();

        event = getEventFromList(name,events);
        if (event == null){
            event = new Event(name, "musical");
            events.add(event);
            this.cache.save(events);
        }else{
            event.fromCache = true;
        }

        return event;
    }

    private Event getEventFromList(String name, List<Event> events){
        Event result = null;

        for(Event e : events){
            if (e.name.equals(name)){
                result = e;
            }
        }

        return result;
    }
}
