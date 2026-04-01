package ro.ase.ro.factorymethod.stbf4.fabrici;

import ro.ase.ro.factorymethod.stbf4.clase.*;

public class TransportTerestruFabrica implements TransportFabrica{
    @Override
    public Transport getTransport(TipTransport tip, Integer nrLinie, String marca, String denumire) {
        return this.getTransport(tip,nrLinie,marca);
    }

    @Override
    public Transport getTransport(TipTransport tip, Integer nrLinie, String marca) {
        switch (tip){
            case TipTransportTerestru.AUTOBUZ :
                return new Autobuz(nrLinie, marca);
            case TipTransportTerestru.TRAMVAI :
                return new Tramvai(nrLinie, marca);
            case TipTransportTerestru.TROLEIBUZ :
                return new Troleibuz(nrLinie, marca);
            default:
                return null;


        }
    }
}
