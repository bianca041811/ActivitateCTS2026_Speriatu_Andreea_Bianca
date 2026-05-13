package ro.ase.cts.spital.clase;

public class Pacient {
    private String nume;
    private MetodaDePlataAbstract metodaDePlata;

    public Pacient(String nume) {
        this.nume = nume;
        this.metodaDePlata = new PlataCard();
        }


    public void setMetodaDePlata(MetodaDePlataAbstract metodaDePlata) {
        this.metodaDePlata = metodaDePlata;
    }

    public void platesteTranzactie(float suma){metodaDePlata.plateste(this.nume,suma);}
}
