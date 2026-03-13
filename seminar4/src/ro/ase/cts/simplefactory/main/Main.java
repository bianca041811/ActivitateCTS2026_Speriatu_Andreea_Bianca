package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.clase.factory.Factory;
import ro.ase.cts.simplefactory.clase.mijlocdetransport.Autobuz;
import ro.ase.cts.simplefactory.clase.mijlocdetransport.MijlocDeTransport;
import ro.ase.cts.simplefactory.clase.mijlocdetransport.TipTransport;
import ro.ase.cts.simplefactory.clase.mijlocdetransport.Tramvai;

public class Main {
    public static void main (String [] args){
        Factory fabricaTransport = new Factory();
        Autobuz autobuz = (Autobuz) fabricaTransport.getMijlocTransport(TipTransport.AUTOBUZ,"MAN",102);
        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai = fabricaTransport.getMijlocTransport(TipTransport.TRAMVAI, "ALSTOM",41);
        tramvai.afiseazaTipTransport();
    }
}
