package ro.ase.ro.simplefactory.spitala2.clase.factory;

import ro.ase.ro.simplefactory.spitala2.clase.functie.*;

public class Factory {
    public Functie getFunctie(TipFunctie tip, Integer salariul , String nume)
    {
        switch (tip)
        {
            case TipFunctie.ASISTENT -> {
                Asistent asistent = new Asistent(salariul,nume);
                return new Asistent(salariul,nume);

            }
            case TipFunctie.MEDIC -> {
                Medic medic = new Medic(salariul,nume);
                return new Medic(salariul,nume);

            }
            case TipFunctie.BRANCARDIER -> {
                Brancardier brancardier = new Brancardier(salariul,nume);
                return new Brancardier(salariul,nume);

            }
            default -> {return null;}
        }
    }
}
