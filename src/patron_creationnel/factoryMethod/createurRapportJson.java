package patron_creationnel.factoryMethod;

public class createurRapportJson extends createurRapport {
    @Override
    protected Rapport instancierRapport() {
        return new RapportJson();
    }
}
