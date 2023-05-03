package springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("Машина");
    }
    @Bean
    public Bus getBusBean() {
        return new Bus("Автобус");
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup("Грузовик");
    }

    @Bean(name = "driverCar")
    public Driver getDriverCar() {
        return new Driver("Водитель", getCarBean());
    }
    @Bean(name = "driverBus")
    public Driver getDriverBus() {
        return new Driver("Водитель", getBusBean());
    }
    @Bean(name = "driverPickup")
    public Driver getDriverPickup() {
        return new Driver("Водитель", getPickupBean());
    }
}
