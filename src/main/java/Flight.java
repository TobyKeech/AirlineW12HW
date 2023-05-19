import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
   private ArrayList<CabinCrewMember>crewMembers;

   private ArrayList<Passenger>bookedPassengers;

   private Plane plane;

   private String flightNumber;

   private String destination;
   private String airport;
   private String time;

   public Flight(Pilot pilot, ArrayList<CabinCrewMember>crewMembers, ArrayList<Passenger>bookedPassengers,
                 Plane plane, String flightNumber,String destination,String airport,String time){
       this.pilot=pilot;
       this.crewMembers = new ArrayList<>();
       this.bookedPassengers = new ArrayList<>();
       this.plane=plane;
       this.flightNumber=flightNumber;
       this.destination=destination;
       this.airport=airport;
       this.time=time;
   }

    public int noOfPassengers(){
        return this.bookedPassengers.size();
    }

    public int noOfCrew(){
       return this.crewMembers.size();
    }

    public void addPass(Passenger passenger){
    this.bookedPassengers.add(passenger);
    }

    public void addCrew(CabinCrewMember cabinCrewMember){
       this.crewMembers.add(cabinCrewMember);
    }

    public String seatsOnPlane() {
        if(plane.getCapacity() > bookedPassengers.size()){
            return "Seats on this plane";
        }
        return "No seats";
    }



}
