package ro.ase.cts.GPS.Main;

import ro.ase.cts.GPS.gpsNou.GpsNou;
import ro.ase.cts.GPS.gpsVechi.AdaptorGpsVechi;
import ro.ase.cts.GPS.gpsVechi.GpsVechi;

public class Main {
    public static void main(String[] args) {
        GpsNou masina1=new GpsNou();
        GpsVechi masina2= new GpsVechi();

        masina1.gasesteMasina();
        masina2.localizeazaMasina();

        AdaptorGpsVechi masinaAdaptata= new AdaptorGpsVechi(masina2);
        masinaAdaptata.gasesteMasina();
    }
}
