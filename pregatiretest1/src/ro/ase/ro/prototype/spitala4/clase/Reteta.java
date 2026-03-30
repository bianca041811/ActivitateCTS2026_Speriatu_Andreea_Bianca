package ro.ase.ro.prototype.spitala4.clase;

public class Reteta implements IReteta{
    private String denumire;
    private int cantitateSolutie;
    private String solutiePrincipala;

    private Reteta(){}

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCantitateSolutie(int cantitateSolutie) {
        this.cantitateSolutie = cantitateSolutie;
    }

    public void setSolutiePrincipala(String solutiePrincipala) {
        this.solutiePrincipala = solutiePrincipala;
    }

    public Reteta(String denumire, int cantitateSolutie, String solutiePrincipala) {
        this.denumire = denumire;
        this.cantitateSolutie = cantitateSolutie;
        this.solutiePrincipala = solutiePrincipala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append(", solutiePrincipala='").append(solutiePrincipala).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public IReteta copiaza() {
        Reteta reteta = new Reteta();
        reteta.denumire=this.denumire;
        reteta.cantitateSolutie=this.cantitateSolutie;
        reteta.solutiePrincipala=this.solutiePrincipala;
        return reteta;

    }
}
