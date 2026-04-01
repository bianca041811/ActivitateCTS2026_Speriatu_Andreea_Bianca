package ro.ase.ro.factorymethod.stbf4.clase;

public abstract class TransportTerestru implements Transport{
    protected Integer nrLinie;
    protected String marca;

    public TransportTerestru(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }
}
