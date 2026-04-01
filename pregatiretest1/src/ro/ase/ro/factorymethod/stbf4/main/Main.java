package ro.ase.ro.factorymethod.stbf4.main;

import ro.ase.ro.factorymethod.stbf4.clase.Transport;
import ro.ase.ro.factorymethod.stbf4.fabrici.*;

public class Main {
    public static void main(String[] args) {
        TransportFabrica fabrica = new TransportTerestruFabrica();
        Transport autobuz = fabrica.getTransport(TipTransportTerestru.AUTOBUZ,178,"MAN");
        Transport tramvai = fabrica.getTransport(TipTransportTerestru.TRAMVAI,41,"aaaaa");

        TransportFabrica fabrica1= new TransportSubteranFabrica();
        Transport metrou = fabrica1.getTransport(TipTransportSubteran.METROU,3,"ALSTOM","Dristor2");


        autobuz.afiseaza();
        tramvai.afiseaza();
        metrou.afiseaza();


    }
}
