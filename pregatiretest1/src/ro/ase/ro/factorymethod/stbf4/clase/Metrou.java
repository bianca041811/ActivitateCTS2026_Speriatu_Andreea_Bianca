package ro.ase.ro.factorymethod.stbf4.clase;

public class Metrou extends TransportSubteran{
    public Metrou(Integer nrLinie, String marca, String denumire) {
        super(nrLinie, marca, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Tramvaiul "+super.nrLinie+" are marca "+super.marca+" si se numeste "+super.denumire);


    }
}
