package patron_creationnel.builder;

public class CarBuilder implements BuilderAuto{

    CarBuilder carBuilder;
    String nbPlace, moteur, tbDeBord, parametrageGPS;


    @Override
    public void setSeats(String nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void setEngine(String moteur) {
        this.moteur = moteur;
    }

    @Override
    public void setTripComputer(String tbDeBord) {
        this.tbDeBord = tbDeBord;
    }

    @Override
    public void setGPS(String parametrageGPS) {
        this.parametrageGPS = parametrageGPS;
    }

    public Car getResult() {
        return new Car(nbPlace, moteur, tbDeBord, parametrageGPS);
    }
}
