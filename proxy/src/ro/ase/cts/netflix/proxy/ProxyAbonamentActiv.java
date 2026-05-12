package ro.ase.cts.netflix.proxy;

import ro.ase.cts.netflix.clase.Abonat;
import ro.ase.cts.netflix.clase.IPlatforma;

public class ProxyAbonamentActiv implements IPlatforma {
    private IPlatforma platforma;

    public ProxyAbonamentActiv(IPlatforma platforma) {
        this.platforma = platforma;
    }

    @Override
    public void permiteAccesFilm(Abonat abonat) {
        if(abonat.isAreAbonamentActiv())
        {
            platforma.permiteAccesFilm(abonat);
        }
        else {
            System.out.println("Abonatul "+abonat.getNume()+" nu are abonament");
        }
    }
}
