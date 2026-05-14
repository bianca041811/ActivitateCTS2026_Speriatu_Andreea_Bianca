package ro.ase.cts.aeroport.proxy;

import ro.ase.cts.aeroport.clase.IAeroport;
import ro.ase.cts.aeroport.clase.Pasager;

public class ProxyBiletBusiness implements IAeroport {
    private IAeroport aeroport;

    public ProxyBiletBusiness(IAeroport aeroport) {
        this.aeroport = aeroport;
    }

    @Override
    public void permiteAccesVip(Pasager pasager) {
        if(pasager.isAreBiletBusiness())
        {
            aeroport.permiteAccesVip(pasager);
        }
        else
        {
            System.out.println("Pasagenul nu are acces in aeroportul vip pentru ca nu are bilet business");
        }
    }
}
