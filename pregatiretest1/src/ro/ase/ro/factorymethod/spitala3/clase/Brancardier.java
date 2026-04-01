package ro.ase.ro.factorymethod.spitala3.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(Integer varsta, String nume) {
        super(varsta, nume);
    }

    @Override
    public void afiseaza() {
        System.out.println("Brancardierul "+nume+" are "+super.varsta+" ani");

    }
}
