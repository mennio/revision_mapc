package patron_creationnel.factoryMethod;

public abstract class createurRapport {
    public Rapport creerRapport(String data, String type) {
        Rapport rapport = instancierRapport();
        rapport.creer(data);
        return rapport;
    }

    protected abstract Rapport instancierRapport();
}


