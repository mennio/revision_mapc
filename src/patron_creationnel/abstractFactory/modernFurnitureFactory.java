package patron_creationnel.abstractFactory;

public class modernFurnitureFactory implements abstractFactory{
    @Override
    public modernChair createChair() {
        return new modernChair();
    }

    @Override
    public modernSofa createSofa() {
        return new modernSofa();
    }
}
