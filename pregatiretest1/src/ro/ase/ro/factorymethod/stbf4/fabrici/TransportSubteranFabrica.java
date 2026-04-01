package ro.ase.ro.factorymethod.stbf4.fabrici;

import ro.ase.ro.factorymethod.stbf4.clase.Metrou;
import ro.ase.ro.factorymethod.stbf4.clase.Transport;

public class TransportSubteranFabrica implements TransportFabrica {

    @Override
    public Transport getTransport(TipTransport tip, Integer nrLinie, String marca) {
        return this.getTransport(tip,nrLinie,marca, "Preciziei");

    }

    @Override
    public Transport getTransport(TipTransport tip, Integer nrLinie, String marca, String denumire) {
      switch (tip){
          case TipTransportSubteran.METROU :
              return new Metrou(nrLinie,marca,denumire);
          default: return null;
      }
    }
}
