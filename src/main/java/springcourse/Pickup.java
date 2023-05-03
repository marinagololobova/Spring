package springcourse;

public class Pickup extends Transport {
    private String pickup;

    public Pickup(String transportType) {
        super(transportType);
    }


    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "pickup='" + pickup + '\'' +
                '}';
    }
}
