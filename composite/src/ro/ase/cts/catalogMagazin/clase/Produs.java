package ro.ase.cts.catalogMagazin.clase;

public class Produs implements Structura {
    private String denumire;
    private float suma;

    public Produs(String denumire, float suma) {
        this.denumire = denumire;
        this.suma = suma;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+ "Produsul: "+this.denumire+" costa "+suma+" lei");

    }
}
