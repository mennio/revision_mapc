package patron_creationnel.factoryMethod;


public class createurRapportXml extends createurRapport {
    @Override
    protected Rapport instancierRapport() {
        return new RapportXml();
    }
}
