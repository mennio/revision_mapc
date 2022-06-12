package patron_creationnel.abstractFactory;

public class victorienFurnitureFactory implements abstractFactory {

    @Override
    public victorienChair createChair() {
        return new victorienChair();
    }

    @Override
    public victorienSofa createSofa() {
        return new victorienSofa();
    }
}