package ro.ase.cts.simplefactory.burgeri;

public class BurgerPui implements IBurger{
    private String nume;
    private Integer gramaj;
    private Integer pret;

    public BurgerPui(String nume, Integer gramaj, Integer pret) {
        this.nume = nume;
        this.gramaj = gramaj;
        this.pret = pret;
    }


    @Override
    public void afiseazaBurger() {
        StringBuilder sb= new StringBuilder();
        sb.append("Burgerul ").append(this.nume).append(" are ").append(this.gramaj).append(" grame si costa ").append(this.pret).append(" lei.");
        System.out.println(sb.toString());

    }
}
