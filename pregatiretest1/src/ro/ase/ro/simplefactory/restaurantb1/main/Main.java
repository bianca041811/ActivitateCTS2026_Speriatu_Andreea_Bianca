package ro.ase.ro.simplefactory.restaurantb1.main;

import ro.ase.ro.simplefactory.restaurantb1.clase.supa.Supa;
import ro.ase.ro.simplefactory.restaurantb1.clase.supa.SupaCiuperci;
import ro.ase.ro.simplefactory.restaurantb1.clase.supa.SupaLegume;
import ro.ase.ro.simplefactory.restaurantb1.clase.supa.TipSupa;
import ro.ase.ro.simplefactory.restaurantb1.clase.factory.Factory;

public class Main {
    public static void main(String[] args) {

        Factory fabricaSupe = new Factory();
        SupaLegume supaLegume = (SupaLegume) fabricaSupe.getSupa(TipSupa.SUPA_LEGUME, 31, "rosie");
        supaLegume.afiseazaTipSupa();

        Supa supaCiuperci = fabricaSupe.getSupa(TipSupa.SUPA_CIUPERCI,20,"alba");
        supaCiuperci.afiseazaTipSupa();
    }
}
