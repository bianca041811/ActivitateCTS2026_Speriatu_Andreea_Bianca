package ro.ase.ro.singleton.managerezervari.clase;

import ro.ase.ro.singleton.managerspital.clase.ManagerSpital;

public class ManagerRezervari {
    protected int id;
    protected String numeClient;
    protected int nrPersoane;
    protected int ora;

    protected static ManagerRezervari instantaSingleton=null;

    private ManagerRezervari(String numeClient, int nrPersoane, int ora) {
        this.id=0;
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void afiseazaManagerRezervari(String text)
    {
        System.out.println("Rezervarea cu id-ul  " + id+" consta in: "+text+" este facuta de clientul: "+numeClient+" are "+nrPersoane+ " persoane "+ " este la ora "+ora);
        this.id++;
    }

    public static synchronized ManagerRezervari getInstanta(String numeClient,int nrPersoane, int ora)
    {
        if(instantaSingleton==null)
        {
            instantaSingleton = new ManagerRezervari(numeClient,nrPersoane,ora);
        }
        return instantaSingleton;
    }

}
