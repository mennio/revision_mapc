package patron_creationnel.builder;

public class ManualCarBuilder implements BuilderAuto{

    ManualCarBuilder m1;

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

    public ManuelCar getResult() {
        return new ManuelCar(nbPlace, moteur, tbDeBord, parametrageGPS);
    }
}
