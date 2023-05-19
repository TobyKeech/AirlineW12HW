import org.junit.Before;

import java.util.ArrayList;

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



}
