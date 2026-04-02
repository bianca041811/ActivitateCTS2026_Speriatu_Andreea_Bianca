package ro.ase.cts.factorymethod.fabrici;

import ro.ase.cts.factorymethod.clase.AbonamentNetNelimitat;
import ro.ase.cts.factorymethod.clase.AbonamentNetbasic;
import ro.ase.cts.factorymethod.clase.Abonament;

public class AbonamentInternetFabrica implements AbonamentFabrica{
    @Override
    public Abonament getAbonament(TipAbonament tip, String numeClient, Integer pret) {
       return this.getAbonament(tip,numeClient, pret, 40);
    }

    @Override
    public Abonament getAbonament(TipAbonament tip, String numeClient, Integer pret,Integer mbps) {
        switch (tip) {
            case TipAbonamentInternet.ABONAMENT_NET_BASIC:
                return new AbonamentNetbasic(numeClient, pret, mbps);
            case TipAbonamentInternet.ABONAMENT_NET_NELIMITAT:
                return new AbonamentNetNelimitat(numeClient, pret, mbps);
            default:
                return null;

        }
    }
}
