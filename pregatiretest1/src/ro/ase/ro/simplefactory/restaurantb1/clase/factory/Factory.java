package ro.ase.ro.simplefactory.restaurantb1.clase.factory;

import ro.ase.ro.simplefactory.restaurantb1.clase.supa.*;

public class Factory {
    public Supa getSupa(TipSupa tip, Integer pret, String culoare)
    {
        switch (tip)
        {
            case TipSupa.SUPA_LEGUME -> {
                SupaLegume supaLegume= new SupaLegume(pret, culoare);
                return new SupaLegume(pret, culoare);

            }
            case TipSupa.SUPA_CIUPERCI -> {
                SupaCiuperci supaCiuperci= new SupaCiuperci(pret, culoare);
                return new SupaCiuperci(pret, culoare);

            }
            case TipSupa.SUPA_VITA -> {
                SupaVita supaVita= new SupaVita(pret, culoare);
                return new SupaVita(pret, culoare);

            }
            default->{return null;}

        }
    }

}
