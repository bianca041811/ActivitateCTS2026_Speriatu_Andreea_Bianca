package ro.ase.ro.singleton.managerdepou.clase;

public class ManagerDepou {
    protected int id;
    protected String numeDepou;
    protected int nrAutobuze;
    protected String oras;
    protected static ManagerDepou instantaSingleton=null;

    private ManagerDepou(String numeDepou, int nrAutobuze, String oras) {
        this.id=0;
        this.numeDepou = numeDepou;
        this.nrAutobuze = nrAutobuze;
        this.oras = oras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeDepou() {
        return numeDepou;
    }

    public void setNumeDepou(String numeDepou) {
        this.numeDepou = numeDepou;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public int getNrAutobuze() {
        return nrAutobuze;
    }

    public void setNrAutobuze(int nrAutobuze) {
        this.nrAutobuze = nrAutobuze;
    }

    public void afiseazaDepou(String text){
        System.out.println("Depoul "+numeDepou+" cu id-ul "+id+" din orasul: "+oras+" are "+nrAutobuze +" autobuze. "+text);
        id++;
    }

    public static synchronized ManagerDepou getInstanta(String numeDepou, int nrAutobuze, String oras)
    {
        if(instantaSingleton==null)
        {
            instantaSingleton=new ManagerDepou(numeDepou,nrAutobuze,oras);
        }
        return instantaSingleton;
    }
}
