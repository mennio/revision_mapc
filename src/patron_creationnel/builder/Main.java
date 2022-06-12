package patron_creationnel.builder;

public class Main {
    public static void main(String[] args) {

        DirectorAuto directorAuto = new DirectorAuto();

        CarBuilder carBuilder = new CarBuilder();
        ManualCarBuilder manualCarBuilder = new ManualCarBuilder();

        directorAuto.makeSportCar(carBuilder);
        directorAuto.makeSUV(carBuilder);
        directorAuto.makeSUV(manualCarBuilder);

        Car car = carBuilder.getResult();
        ManuelCar manuelCar = manualCarBuilder.getResult();
        System.out.println("\n manuel voiture construit:\n" + manuelCar.print());
    }
}