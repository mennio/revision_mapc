package patron_creationnel.factoryMethod;

public class Main {
    public static void main(String[] args) {

            createurRapportHtml createurRapport_html = new createurRapportHtml();
            createurRapport_html.instancierRapport();
            System.out.println(createurRapport_html.creerRapport("je suis un fichier html","html").getContenu());


            createurRapportJson createurRapport_json = new createurRapportJson();
            createurRapport_json.instancierRapport();
            System.out.println(createurRapport_json.creerRapport("je suis un fichier json","html").getContenu());

            createurRapportXml createurRapport_xml = new createurRapportXml();
            createurRapport_xml.instancierRapport();
            System.out.println(createurRapport_xml.creerRapport("je suis un fichier xml","html").getContenu());
    }
}