import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPilot {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot(Rank.CAPTIAN, "BG47483", "Bob");
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I can fly this plane", pilot.flyPlane());
    }

}
