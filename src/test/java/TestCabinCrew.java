import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCabinCrew {
    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember= new CabinCrewMember("Meg", Rank.FLIGHTATTENDENT);
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Hello, we are going to the moon today, it is made of cheese.", cabinCrewMember.relayMessage());
    }
}
