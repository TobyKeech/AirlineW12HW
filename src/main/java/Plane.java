public enum Plane {

    F22RAPTOR(100, 10000),
    HERCULES (200, 2000),
    BLACKBIRD (4, 50);
    private Integer capacity;
    private Integer weight;

    Plane(Integer capacity, Integer weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public Integer getWeight() {
        return this.weight;
    }
}
