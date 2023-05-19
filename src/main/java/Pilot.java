public class Pilot {

    private String licenceNo;
    private String name;

    Rank rank;

    public Pilot(Rank rank, String licenceNo, String name){
        this.rank=rank;
        this.name= name;
        this.licenceNo = licenceNo;

    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public String flyPlane(){
        return "I can fly this plane";
    }

}
