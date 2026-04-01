package ro.ase.ro.factorymethod.stbf4.fabrici;

import ro.ase.ro.factorymethod.stbf4.clase.Transport;

public interface TransportFabrica {
    public Transport getTransport(TipTransport tip, Integer nrLinie, String marca);
    public Transport getTransport(TipTransport tip, Integer nrLinie, String marca,String denumire);

}
