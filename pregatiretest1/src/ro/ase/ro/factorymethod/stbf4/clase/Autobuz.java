package ro.ase.ro.factorymethod.stbf4.clase;

public class Autobuz extends TransportTerestru{
    public Autobuz(Integer nrLinie, String marca) {
        super(nrLinie, marca);
    }

    @Override
    public void afiseaza() {
        System.out.println("Autobuzul "+super.nrLinie+" are marca "+super.marca);
    }
}
