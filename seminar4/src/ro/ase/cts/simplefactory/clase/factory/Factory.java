package ro.ase.cts.simplefactory.clase.factory;

import ro.ase.cts.simplefactory.clase.mijlocdetransport.*;

public class Factory {

    public MijlocDeTransport getMijlocTransport(TipTransport tip ,String marca, Integer nrLinie){
    switch(tip){
        case TipTransport.AUTOBUZ->{
            Autobuz autobuz = new Autobuz(nrLinie, marca);
            return new Autobuz(nrLinie, marca);

        }
        case TipTransport.TRAMVAI->{
            Tramvai tramvai = new Tramvai(nrLinie, marca);
            return new Tramvai(nrLinie, marca);

        }
        case TipTransport.TROLEIBUZ->{
            Troleibuz troleibuz = new Troleibuz(nrLinie, marca);
            return new Troleibuz(nrLinie,marca);

        }
        default-> {
            return null;
        }

        }
    }
}
