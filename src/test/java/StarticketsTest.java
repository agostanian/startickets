/**
 * Created by alan on 15/09/14.
 */
import edu.um.EventManager;
import edu.um.EventManagerCacheDecorator;
import edu.um.Event;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StarticketsTest {
    @Test
    public void testCache() {
        EventManagerCacheDecorator eventManager = new EventManagerCacheDecorator(new EventManager());

        Event event1 = eventManager.getEventByName("party");
        assertEquals(false,event1.fromCache);

        Event event2 = eventManager.getEventByName("party");
        assertEquals(true, event2.fromCache);


    }
}
