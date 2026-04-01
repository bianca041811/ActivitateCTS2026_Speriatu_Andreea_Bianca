package ro.ase.ro.factorymethod.spitala3.clase;

public class Medic extends PersonalMedical{
    public Medic(Integer varsta, String nume) {
        super(varsta, nume);
    }

    @Override
    public void afiseaza() {
        System.out.println("Medicul "+nume+" are "+super.varsta+" ani");

    }
}
