package ro.ase.ro.factorymethod.stbf4.clase;

public class Troleibuz extends TransportTerestru{
    public Troleibuz(Integer nrLinie, String marca) {
        super(nrLinie, marca);
    }

    @Override
    public void afiseaza() {
        System.out.println("Troleibuzul "+super.nrLinie+" are marca "+super.marca);

    }
}
