package ro.ase.cts.factorymethod.clase;

public abstract class AbonamentTV implements Abonament{
    protected String numeClient;
    protected Integer pret;

    public AbonamentTV(String numeClient, Integer pret) {
        this.numeClient = numeClient;
        this.pret = pret;
    }
}
