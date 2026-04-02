package ro.ase.cts.factorymethod.clase;

public abstract class AbonamentInternet implements Abonament {
    protected String numeClient;
    protected Integer pret;
    protected Integer mbps;

    public AbonamentInternet(String numeClient, Integer pret, Integer mbps) {
        this.numeClient = numeClient;
        this.pret = pret;
        this.mbps = mbps;
    }
}
