package ro.ase.cts.netflix.main;

import ro.ase.cts.netflix.clase.Abonat;
import ro.ase.cts.netflix.clase.PlatformaStreeming;
import ro.ase.cts.netflix.proxy.ProxyAbonamentActiv;

public class Main {
    public static void main(String[] args) {
        Abonat abonat= new Abonat("Dinescu",false);
        PlatformaStreeming platformaStreeming=new PlatformaStreeming("Netflix");

        platformaStreeming.permiteAccesFilm(abonat);

        ProxyAbonamentActiv proxy = new ProxyAbonamentActiv(platformaStreeming);
        proxy.permiteAccesFilm(abonat);
    }
}
