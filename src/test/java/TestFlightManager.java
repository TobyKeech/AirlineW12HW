import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlightManager {

    FlightManager flightManager;

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;

    private ArrayList<Passenger>bookedPassengers;

    private Plane plane;

    private String flightNumber;

    private String destination;
    private String airport;
    private String time;

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void setUp(){

        flightManager = new FlightManager(pilot,crewMembers,bookedPassengers,Plane.HERCULES, "BA712717", "Moon"
                ,"Darkside of Moon", "12/5/2030");
        bookedPassengers = new ArrayList<>();
        passenger1 = new Passenger("Toby", 1);
        passenger2 = new Passenger("James", 2);
        passenger3 = new Passenger("Ross", 3);
        flightManager.addPass(passenger1);
        flightManager.addPass(passenger2);
        flightManager.addPass(passenger3);


    }

    @Test
    public void testPlaneWeigthForBags(){
        assertEquals(1000, flightManager.planeWeightForBags(Plane.HERCULES));
    }

    @Test
    public void testWeightofBagPerPassanger(){
        assertEquals(5, flightManager.baggaeWeightPerPassanger(Plane.HERCULES));
    }

    @Test
    public void testWeightBookedByPassangers(){
        assertEquals(15, flightManager.weightBookedByPassangers(Plane.HERCULES, flightManager));
    }

    @Test
    public void testWeightRemaining(){
        assertEquals(985, flightManager.weightRemaining(Plane.HERCULES, flightManager));
    }
}
