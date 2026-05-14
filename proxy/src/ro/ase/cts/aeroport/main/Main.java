package ro.ase.cts.aeroport.main;

import ro.ase.cts.aeroport.clase.Aeroport;
import ro.ase.cts.aeroport.clase.IAeroport;
import ro.ase.cts.aeroport.clase.Pasager;
import ro.ase.cts.aeroport.proxy.ProxyBiletBusiness;

public class Main {
    public static void main(String[] args) {
        Pasager pasager= new Pasager("Popescu",true);
        Aeroport aeroport= new Aeroport("aeroport business");

        aeroport.permiteAccesVip(pasager);

        ProxyBiletBusiness proxy= new ProxyBiletBusiness(aeroport);
        proxy.permiteAccesVip(pasager);

    }
}
