package springcourse;

public class Bus extends Transport{
    private String bus;

    public Bus(String transportType) {
        super(transportType);
    }


    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "bus='" + bus + '\'' +
                '}';
    }
}
