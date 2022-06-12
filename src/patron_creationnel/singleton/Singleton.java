package patron_creationnel.singleton;

public final class Singleton {
    private static Singleton uneInstance;
    public String value;

    public Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (uneInstance == null) {
            uneInstance = new Singleton(value);
        }
        return uneInstance;
    }

}

/*
*
*
* public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
* */
