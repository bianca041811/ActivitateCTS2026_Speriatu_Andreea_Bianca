package ro.ase.cts.restaurant.clase;

public class Subsectiune implements Meniu {
    private String denumire;
    private float pret;

    public Subsectiune(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseazaMeniu(String spatii) {
        System.out.println(spatii+"Produsul "+denumire+" costa "+pret+" lei");
    }
}
