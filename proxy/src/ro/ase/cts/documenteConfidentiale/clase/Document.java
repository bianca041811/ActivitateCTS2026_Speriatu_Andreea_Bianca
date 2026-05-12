package ro.ase.cts.documenteConfidentiale.clase;

public class Document implements IDocument{
    private String nume;

    public Document(String nume) {
        this.nume = nume;
    }

    @Override
    public void citesteDocument(Angajat angajat) {
        System.out.println("Angajatul "+angajat.getNume()+" poate citi documentul "+this.nume);
    }
}
