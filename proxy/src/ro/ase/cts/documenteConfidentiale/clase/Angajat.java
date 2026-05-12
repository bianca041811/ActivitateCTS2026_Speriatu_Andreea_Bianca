package ro.ase.cts.documenteConfidentiale.clase;

public class Angajat {
    private String nume;
    private boolean eManager;

    public Angajat(String nume, boolean eManager) {
        this.nume = nume;
        this.eManager = eManager;
    }

    public String getNume() {
        return nume;
    }

    public boolean iseManager() {
        return eManager;
    }

}
