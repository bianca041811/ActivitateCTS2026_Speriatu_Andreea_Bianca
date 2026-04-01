package ro.ase.ro.factorymethod.stbf4.clase;

public abstract class TransportSubteran implements Transport{
    protected Integer nrLinie;
    protected String marca;
    protected String denumire;

    public TransportSubteran(Integer nrLinie, String marca, String denumire) {
        this.nrLinie = nrLinie;
        this.marca = marca;
        this.denumire = denumire;
    }
}
