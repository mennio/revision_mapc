package patron_creationnel.abstractFactory;

public class Main {
    public static void main(String[] args) {
        victorienChair p1 = new victorienFurnitureFactory().createChair();
        System.out.println(p1.asLeg());
        System.out.println(p1.sitOn());
    }
}