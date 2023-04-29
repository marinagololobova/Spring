package springcourse;

public abstract class Transport {
    private String transportType;

    public Transport(String transportType) {
        this.transportType = transportType;
    }

    public void start() {
        System.out.println(transportType + " готов(а) к работе.");
    }

    public String getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportType='" + transportType + '\'' +
                '}';
    }
}
