package ro.ase.cts.stb.facade;

import ro.ase.cts.stb.clase.Usa;

public class StbFacade {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public StbFacade() {
        this.usaFata = new Usa("fata");
        this.usaMijloc = new Usa("mijloc");
        this.usaSpate = new Usa("spate");
    }

    public void puneToateUsileInModulLiber()
    {
        usaFata.puneModLiber();
        usaMijloc.puneModLiber();
        usaSpate.puneModLiber();
    }

    public void deschideFortatToateUsile()
    {
        usaFata.deschidereFortata();
        usaMijloc.deschidereFortata();
        usaSpate.deschidereFortata();

    }

}
