package ro.ase.cts.simplefactory.burgeri;

public class BurgerVita implements IBurger{
    private String nume;
    private Integer gramaj;
    private Integer pret;

    public BurgerVita(String nume, Integer pret, Integer gramaj) {
        this.nume = nume;
        this.pret = pret;
        this.gramaj = gramaj;
    }


    @Override
    public void afiseazaBurger() {
        StringBuilder sb= new StringBuilder();
        sb.append("Burgerul ").append(this.nume).append(" are ").append(this.gramaj).append(" grame si costa ").append(this.pret).append(" lei.");
        System.out.println(sb.toString());
    }
}
