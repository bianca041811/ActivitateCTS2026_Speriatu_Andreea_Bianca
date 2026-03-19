package ro.ase.cts.clase;

public class Clatite extends Desert{
    @Override
    public void afiseaza() {
        System.out.println("Clatitele cu "+denumire+" are "+super.gramaj+" grame ");

    }

    public Clatite(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }
}
