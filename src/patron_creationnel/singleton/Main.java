package patron_creationnel.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("instance 1");
        Singleton autreSingleton = Singleton.getInstance("instance 2");
        System.out.println(singleton.value);
        System.out.println(autreSingleton.value);
    }
}