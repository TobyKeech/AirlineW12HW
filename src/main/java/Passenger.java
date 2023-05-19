public class Passenger {

    private String name;
    private Integer bags;

    public Passenger(String name, int bags){
        this.bags=bags;
        this.name=name;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBags() {
        return this.bags;
    }

    public void setBags(Integer bags) {
        this.bags = bags;
    }
}
