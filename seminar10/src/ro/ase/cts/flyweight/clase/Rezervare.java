package ro.ase.cts.flyweight.clase;

public class Rezervare {
    private int numarMasa;
    private String oraRezervare;
    private int nrPersoane;

    public Rezervare(int numarMasa, String oraRezervare, int nrPersoane) {
        this.numarMasa = numarMasa;
        this.oraRezervare = oraRezervare;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
