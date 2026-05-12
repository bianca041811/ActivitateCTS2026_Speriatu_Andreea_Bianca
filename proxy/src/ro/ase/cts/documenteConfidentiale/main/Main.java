package ro.ase.cts.documenteConfidentiale.main;


import ro.ase.cts.documenteConfidentiale.clase.Angajat;
import ro.ase.cts.documenteConfidentiale.clase.Document;
import ro.ase.cts.documenteConfidentiale.proxy.ProxyManager;

public class Main {
    public static void main(String[] args) {
        Angajat angajat = new Angajat("Mirabela",false);
        Document document=new Document("arhiva salariala");

        document.citesteDocument(angajat);

        ProxyManager proxy= new ProxyManager(document);
        proxy.citesteDocument(angajat);
    }
}
