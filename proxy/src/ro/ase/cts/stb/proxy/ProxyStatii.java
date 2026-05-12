package ro.ase.cts.stb.proxy;

import ro.ase.cts.stb.clase.IAutobuz;
import ro.ase.cts.stb.clase.Statie;

public class ProxyStatii implements IAutobuz {
    private IAutobuz autobuz;

    public ProxyStatii(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste(Statie statie) {
        if(statie.getNrPersoane()>0)
        {
            autobuz.opreste(statie);
        }
        else {
            System.out.println("In statia "+statie.getNume()+" nu se afla persoane");
        }
    }
}
