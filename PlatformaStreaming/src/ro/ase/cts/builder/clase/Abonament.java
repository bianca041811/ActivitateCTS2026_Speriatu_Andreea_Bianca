package ro.ase.cts.builder.clase;

public class Abonament {
    protected boolean ingheataZi;
    protected boolean rezolutieMare;
    protected boolean ecranSuplimentar;
    protected String nume;

    public Abonament(boolean ingheataZi, boolean rezolutieMare, boolean ecranSuplimentar, String nume) {
        this.ingheataZi = ingheataZi;
        this.rezolutieMare = rezolutieMare;
        this.ecranSuplimentar = ecranSuplimentar;
        this.nume = nume;
    }

    public void setIngheataZi(boolean ingheataZi) {
        this.ingheataZi = ingheataZi;
    }

    public void setRezolutieMare(boolean rezolutieMare) {
        this.rezolutieMare = rezolutieMare;
    }

    public void setEcranSuplimentar(boolean ecranSuplimentar) {
        this.ecranSuplimentar = ecranSuplimentar;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonament{");
        sb.append("ingheataZi=").append(ingheataZi);
        sb.append(", rezolutieMare=").append(rezolutieMare);
        sb.append(", ecranSuplimentar=").append(ecranSuplimentar);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
