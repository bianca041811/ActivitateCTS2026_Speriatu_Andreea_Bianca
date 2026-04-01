package ro.ase.cts.prototype.clase;

public class BurgerPrestabilit implements IBurgerPrestabilit{
    private String nume;
    private Integer gramaj;
    private Integer pret;
    private BurgerPrestabilit(){};

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setGramaj(Integer gramaj) {
        this.gramaj = gramaj;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BurgerPrestabilit{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public BurgerPrestabilit(String nume, Integer gramaj, Integer pret) {
        this.nume = nume;
        if(gramaj>0)
        {
            this.gramaj = gramaj;
        }
        else {
            this.gramaj = 0;
        }
        if(pret>0)
        {
            this.pret = pret;
        }
        else {
            this.pret = 0;
        }
    }

    @Override
    public IBurgerPrestabilit copiaza() {
       BurgerPrestabilit burgerPrestabilit= new BurgerPrestabilit();
       burgerPrestabilit.nume=this.nume;
       burgerPrestabilit.gramaj=this.gramaj;
       burgerPrestabilit.pret=this.pret;
       return burgerPrestabilit;
    }
}
