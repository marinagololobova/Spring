package springcourse;

public class Car extends Transport{
    private String car;

    public Car(String transportType) {
        super(transportType);
    }


    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }
}
