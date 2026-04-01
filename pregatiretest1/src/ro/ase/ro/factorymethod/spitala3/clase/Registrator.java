package ro.ase.ro.factorymethod.spitala3.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, Integer salariul, Integer varsta) {
        super(nume, salariul, varsta);
    }

    @Override
    public void afiseaza() {
        System.out.println("Registratorul "+nume+" are "+super.varsta+" ani si are slariul de "+super.salariul+" lei" );

    }
}
