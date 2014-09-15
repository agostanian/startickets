package edu.um;

/**
 * Created by alan on 15/09/14.
 */
public class EventManager {
    public Event getEventByName(String name) {

        // busca el evento en la base de datos

        // para este ejercicio devolvemos en evento fijo simulando el acceso a base de datos

        return new Event(name,"musical");

    }
}
