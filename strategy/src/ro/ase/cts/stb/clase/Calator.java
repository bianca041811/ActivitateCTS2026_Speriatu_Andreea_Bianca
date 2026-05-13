package ro.ase.cts.stb.clase;

public class Calator {
    private String nume;
    private ModalitatePlata modalitatePlata;

    public Calator(String nume) {
        this.nume = nume;
        this.modalitatePlata = new PlataCardCalatorii();
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteTranzactie(float suma){modalitatePlata.plateste(this.nume,suma);}
}
