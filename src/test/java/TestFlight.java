import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlight {
    Pilot pilot;

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    ArrayList<CabinCrewMember>cabinCrewMembers;
    ArrayList<Passenger>bookedPassengers;

    Passenger passenger1;
    Passenger passenger2;

    Flight flight;

    Plane hercules;

    @Before
    public void setUp(){
        flight = new Flight(pilot,cabinCrewMembers,bookedPassengers,Plane.HERCULES, "BA712717", "Moon"
        ,"Darkside of Moon", "12/5/2030");
        pilot = new Pilot( Rank.CAPTIAN,"BG434343", "Keith");

        cabinCrewMembers = new ArrayList<>();
        bookedPassengers = new ArrayList<>();

        cabinCrewMember1 = new CabinCrewMember("Meg", Rank.FLIGHTATTENDENT);
        cabinCrewMember2 = new CabinCrewMember("Fran", Rank.FIRSTOFFICER);
        cabinCrewMember3= new CabinCrewMember("Bruce", Rank.PURSER);

        passenger1 = new Passenger("Toby", 1);
        passenger2 = new Passenger("James", 2);

    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPass(passenger1);
        flight.addPass(passenger2);
        assertEquals(2, flight.noOfPassengers());
    }

    @Test
    public void canAddCabinCrewToFlight(){
        flight.addCrew(cabinCrewMember1);
        flight.addCrew(cabinCrewMember2);
        flight.addCrew(cabinCrewMember3);
        assertEquals(3,flight.noOfCrew());
    }

    @Test
    public void checkForSeats(){
        assertEquals("Seats on this plane", flight.seatsOnPlane());
    }



}
