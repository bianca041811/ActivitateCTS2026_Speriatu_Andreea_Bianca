package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.Autobuz;
import ro.ase.cts.stb.clase.Statie;
import ro.ase.cts.stb.proxy.ProxyStatii;

public class Main {
    public static void main(String[] args) {
        Statie statie=new Statie("ROMAERO",0);
        Autobuz autobuz= new Autobuz("137");

        autobuz.opreste(statie);

        ProxyStatii proxy=new ProxyStatii(autobuz);
        proxy.opreste(statie);
    }
}
