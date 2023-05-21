import java.util.ArrayList;

public class FlightManager extends Flight {

    public FlightManager(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> bookedPassengers,
                         Plane plane, String flightNumber, String destination, String airport, String time) {
        super(pilot, crewMembers, bookedPassengers, plane, flightNumber, destination, airport, time);
    }
    public int planeWeightForBags(Plane plane){
        return plane.getWeight() / 2;

    }

    public int baggaeWeightPerPassanger(Plane plane){
        return planeWeightForBags(plane) / plane.getCapacity();

}

    public int weightBookedByPassangers(Plane plane, Flight flight){
         return baggaeWeightPerPassanger(plane) * flight.noOfPassengers();

    }

}








