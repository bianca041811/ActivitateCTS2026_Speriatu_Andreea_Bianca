package ro.ase.ro.factorymethod.stbf4.clase;

public class Tramvai extends TransportTerestru{
    public Tramvai(Integer nrLinie, String marca) {
        super(nrLinie, marca);
    }

    @Override
    public void afiseaza() {
        System.out.println("Tramvaiul "+super.nrLinie+" are marca "+super.marca);

    }
}
