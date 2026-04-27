package ro.ase.cts.singleton.clase;

public class ProgramareMachiaj {
    protected String numeClienta;
    protected  Integer ora;
    protected  Integer pret;
    protected boolean avans;
    protected static ProgramareMachiaj instantaSingleton=null;

    private ProgramareMachiaj(String numeClienta, Integer ora, Integer pret, boolean avans) {
        if(numeClienta!=null){
        this.numeClienta = numeClienta;}
        else
            this.numeClienta="";
        if(ora>=8&&ora<=16){
        this.ora = ora;}
        else
            this.ora=8;
        if(pret>=50){
        this.pret = pret;}
        else this.pret=50;
        if(avans==true){
        this.avans = avans;}
        else this.avans=false;
    }

    public String getNumeClienta() {
        return numeClienta;
    }

    public void setNumeClienta(String numeClienta) {
        this.numeClienta = numeClienta;
    }

    public Integer getOra() {
        return ora;
    }

    public void setOra(Integer ora) {
        this.ora = ora;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public boolean isAvans() {
        return avans;
    }

    public void setAvans(boolean avans) {
        this.avans = avans;
    }
    public void afiseazaProgramare(String text){
        System.out.println("Programaerea clientei "+numeClienta+" de la ora "+ora+" costa "+pret+" lei , avans "+avans+" si a constat in "+text);

    }

    public static synchronized ProgramareMachiaj getInstanta(String numeClienta, Integer ora,Integer pret,boolean avans) {
        if(instantaSingleton==null){
            instantaSingleton = new ProgramareMachiaj(numeClienta, ora, pret, avans);
        }
        return instantaSingleton;
    }


}
