package patron_creationnel.builder;

public class DirectorAuto {
    public void makeSUV(BuilderAuto builder){
        builder.setEngine("moteur citroen");
        builder.setGPS("je suis le gps tomtom");
        builder.setSeats("il y a 5 place");
        builder.setTripComputer("pas de réglage");
    }

    public void makeSportCar(BuilderAuto builder){
        builder.setEngine("moteur audi");
        builder.setGPS("je suis le gps audi");
        builder.setSeats("il y a 4 place");
        builder.setTripComputer("reglage a faire sur le dictatel");
    }
}
