package ro.ase.ro.simplefactory.spitala2.main;

import ro.ase.ro.simplefactory.spitala2.clase.factory.Factory;
import ro.ase.ro.simplefactory.spitala2.clase.functie.Asistent;
import ro.ase.ro.simplefactory.spitala2.clase.functie.Functie;
import ro.ase.ro.simplefactory.spitala2.clase.functie.TipFunctie;

public class Main {
    public static void main(String[] args) {
        Factory fabricaFunctie = new Factory();
        Asistent asistent = (Asistent) fabricaFunctie.getFunctie(TipFunctie.ASISTENT, 4000, "POP");
        asistent.afiseazaTipFunctie();


        Functie medic = fabricaFunctie.getFunctie(TipFunctie.MEDIC, 7000, "ionescu");
        medic.afiseazaTipFunctie();
    }
}
