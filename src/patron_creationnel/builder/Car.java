package patron_creationnel.builder;

public class Car {
    private final String seats;
    private final String engine;
    private final String tripComputer;
    private final String gpsNavigator;
    private double fuel = 0;

    public Car(String seats, String engine,
               String tripComputer, String gpsNavigator) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }


    public String getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGpsNavigator() {
        return gpsNavigator;
    }
}

