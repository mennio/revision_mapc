package patron_creationnel.factoryMethod;


public class RapportHtml implements Rapport {
    String data;
    @Override
    public void creer(String data) {
        this.data = data;
    }

    @Override
    public String getContenu() {
        return data;
    }
}
