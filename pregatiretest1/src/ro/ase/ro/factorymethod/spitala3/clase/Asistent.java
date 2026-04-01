package ro.ase.ro.factorymethod.spitala3.clase;

public class Asistent extends PersonalMedical{
    public Asistent(Integer varsta, String nume) {
        super(varsta, nume);
    }

    @Override
    public void afiseaza() {
        System.out.println("Asistentul "+nume+" are "+super.varsta+" ani");
    }
}
