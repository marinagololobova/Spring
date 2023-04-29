package springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        car.start();
        Bus bus = context.getBean(Bus.class);
        bus.start();
        Pickup pickup = context.getBean(Pickup.class);
        pickup.start();

        Driver driverCar = context.getBean("driverCar", Driver.class);
        driverCar.startTheTransport();
        Driver driverBus = context.getBean("driverBus", Driver.class);
        driverBus.startTheTransport();
        Driver driverPickup = context.getBean("driverPickup", Driver.class);
        driverPickup.startTheTransport();

        context.close();
    }
}
