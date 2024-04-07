import org.example.lab1.Builder.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
    @Test
    public void test() {
        CarBuilder builder = new CarBuilder();
        CarType expectedType = CarType.SPORTS_CAR;
        int expectedSeats = 2;
        Engine expectedEngine = new Engine(3.0, 0);
        Transmission expectedTransmission = Transmission.SEMI_AUTOMATIC;
        TripComputer expectedTripComputer = new TripComputer();
        GPSNavigator expectedGPSNavigator = new GPSNavigator();

        builder.setCarType(expectedType);
        builder.setSeats(expectedSeats);
        builder.setEngine(expectedEngine);
        builder.setTransmission(expectedTransmission);
        builder.setTripComputer(expectedTripComputer);
        builder.setGPSNavigator(expectedGPSNavigator);
        Car car = builder.getResult();

        assertEquals(expectedType, car.getCarType());

        assertEquals(expectedSeats, car.getSeats());

        assertEquals(expectedEngine, car.getEngine());

        assertEquals(expectedTransmission, car.getTransmission());

        assertEquals(expectedTripComputer, car.getTripComputer());

        assertEquals(expectedGPSNavigator, car.getGpsNavigator());
    }
}
