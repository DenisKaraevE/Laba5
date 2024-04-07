package org.example.lab1.Builder;

public class BuilderService {
    public void exec() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.toString());

        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(5.0, 100));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        car = builder.getResult();
        System.out.println("Car built:\n" + car.toString());

        builder.setCarType(CarType.SUV);
        builder.setSeats(6);
        builder.setEngine(new Engine(5.0, 111));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        car = builder.getResult();
        System.out.println("Car built:\n" + car.toString());
    }
}
