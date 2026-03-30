package ro.ase.ro.singleton.managerspital.clase;

public class ManagerSpital {
    protected int id;
    protected String nume;
    protected int varsta;
    protected float salariul;

    protected static ManagerSpital instantaSingleton=null;

    private ManagerSpital(String nume, int varsta, float salariul) {
        this.id=0;
        this.nume = nume;
        this.varsta = varsta;
        this.salariul = salariul;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public float getSalariul() {
        return salariul;
    }

    public void setSalariul(float salariul) {
        this.salariul= salariul;
    }

    public void afiseazaManager(String text)
    {
        System.out.println("managerul spitalului cu id-il "+id+" se numeste "+nume+" , are varsta "+varsta+" si salariul "+salariul+" si "+text);
        this.id++;
    }
    public static synchronized ManagerSpital getInstanta(String nume, int varsta,float salariul)
    {
        if(instantaSingleton==null)
        {
            instantaSingleton=new ManagerSpital(nume,varsta,salariul);
        }
        return instantaSingleton;
    }


}
