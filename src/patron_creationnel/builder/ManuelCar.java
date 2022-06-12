package patron_creationnel.builder;

public class ManuelCar {
    private final String seats;
    private final String engine;
    private final String tripComputer;
    private final String gpsNavigator;

    public ManuelCar( String seats, String engine, String tripComputer, String gpsNavigator) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "nombre de place: " + seats + "\n";
        if (this.tripComputer != "null") {
            info += "computer fonctionnel" + "\n";
        } else {
            info += "computer pas fonctionnel" + "\n";
        }
        if (this.gpsNavigator != "") {
            info += "GPS est fonctionnel" + "\n";
        } else {
            info += "GPS est pas fonctionnel" + "\n";
        }
        return info;
    }
}
