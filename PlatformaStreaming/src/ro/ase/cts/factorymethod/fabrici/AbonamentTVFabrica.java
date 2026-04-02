package ro.ase.cts.factorymethod.fabrici;

import ro.ase.cts.factorymethod.clase.AbonamentTV;
import ro.ase.cts.factorymethod.clase.AbonamentTVPremium;
import ro.ase.cts.factorymethod.clase.AbonamentTVbasic;
import ro.ase.cts.factorymethod.clase.Abonament;

public class AbonamentTVFabrica implements AbonamentFabrica{

    @Override
    public Abonament getAbonament(TipAbonament tip, String numeClient, Integer pret, Integer mbps) {
        return this.getAbonament(tip,numeClient,pret);
    }

    @Override
    public Abonament getAbonament(TipAbonament tip, String numeClient, Integer pret) {
        switch (tip)
        {
            case TipAbonamentTV.ABONAMENT_TV_BASIC :
                return new AbonamentTVbasic(numeClient,pret);
            case TipAbonamentTV.ABONAMENT_TV_PREMIUM:
                return new AbonamentTVPremium(numeClient,pret);
            default : return null;


        }
    }
}
