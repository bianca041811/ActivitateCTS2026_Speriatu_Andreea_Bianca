package ro.ase.cts.netflix.clase;

public class Abonat {
    private String nume;
    private boolean areAbonamentActiv;

    public Abonat(String nume, boolean areAbonamentActiv) {
        this.nume = nume;
        this.areAbonamentActiv = areAbonamentActiv;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAbonamentActiv() {
        return areAbonamentActiv;
    }
}
