package springcourse;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void startTheTransport() {
        System.out.println(name + " сел(а) в " + transport.getTransportType());
        transport.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                '}';
    }
}
