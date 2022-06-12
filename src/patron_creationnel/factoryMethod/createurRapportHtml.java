package patron_creationnel.factoryMethod;

public class createurRapportHtml extends createurRapport {
    @Override
    protected Rapport instancierRapport() {
        return new RapportHtml();
    }
}
