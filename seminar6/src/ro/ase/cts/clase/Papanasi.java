package ro.ase.cts.clase;

public class Papanasi extends Desert{
    @Override
    public void afiseaza() {
        System.out.println("Papanasii cu "+denumire+" are "+super.gramaj+" grame "+" si " +
                super.calorii+" calorii ");
    }

    public Papanasi(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }
}
