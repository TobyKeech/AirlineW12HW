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
    Passenger passenger3;

    Flight flight1;
    Flight flight2;

    Plane hercules;

    @Before
    public void setUp(){
        flight1 = new Flight(pilot,cabinCrewMembers,bookedPassengers,Plane.BLACKBIRD, "BA712717", "Moon"
        ,"Darkside of Moon", "12/5/2030");
        flight2 = new Flight(pilot,cabinCrewMembers,bookedPassengers,Plane.HERCULES, "BA712717", "Mars"
                ,"Darkside of Mars", "07/5/2040");

        pilot = new Pilot( Rank.CAPTIAN,"BG434343", "Keith");

        cabinCrewMembers = new ArrayList<>();
        bookedPassengers = new ArrayList<>();

        cabinCrewMember1 = new CabinCrewMember("Meg", Rank.FLIGHTATTENDENT);
        cabinCrewMember2 = new CabinCrewMember("Fran", Rank.FIRSTOFFICER);
        cabinCrewMember3= new CabinCrewMember("Bruce", Rank.PURSER);

        passenger1 = new Passenger("Toby", 1);
        passenger2 = new Passenger("James", 2);
        passenger3 = new Passenger("Ross", 3);

    }

    @Test
    public void canAddPassengerToFlight(){
        flight1.addPass(passenger1);
        flight1.addPass(passenger2);
        assertEquals(2, flight1.noOfPassengers());
    }

    @Test
    public void canAddCabinCrewToFlight(){
        flight1.addCrew(cabinCrewMember1);
        flight1.addCrew(cabinCrewMember2);
        flight1.addCrew(cabinCrewMember3);
        assertEquals(3,flight1.noOfCrew());
    }

    @Test
    public void checkWontAddIfNoSeats(){
        flight1.seatsOnPlane(passenger1);
        flight1.seatsOnPlane(passenger2);
        flight1.seatsOnPlane(passenger3);
        assertEquals(2, flight1.noOfPassengers());
    }

    @Test
    public void checkForSeats(){
        flight2.seatsOnPlane(passenger1);
        flight2.seatsOnPlane(passenger2);
        flight2.seatsOnPlane(passenger3);
        assertEquals(3, flight2.noOfPassengers());
    }



}
