package ro.ase.ro.factorymethod.spitala3.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, Integer salariul, Integer varsta) {
        super(nume, salariul, varsta);
    }

    @Override
    public void afiseaza() {
        System.out.println("Secretarul "+nume+" are "+super.varsta+" ani si are slariul de "+super.salariul+" lei" );

    }
}
