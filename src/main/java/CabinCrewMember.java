public class CabinCrewMember {

    private String name;

    Rank rank;

    CabinCrewMember(String name, Rank rank ){
        this.rank = rank;
        this.name=name;
    }

    public String relayMessage(){
        return "Hello, we are going to the moon today, it is made of cheese.";
    }
}



