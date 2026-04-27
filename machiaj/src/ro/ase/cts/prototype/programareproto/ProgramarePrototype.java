package ro.ase.cts.prototype.programareproto;

import ro.ase.cts.builder.clase.Programare;

public class ProgramarePrototype implements IProgramare {
    protected String numeClienta;
    protected  Integer ora;
    protected  Integer pret;
    protected boolean avans;

    private ProgramarePrototype(){};

    public ProgramarePrototype(String numeClienta, Integer ora, Integer pret, boolean avans) {
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

    public void setNumeClienta(String numeClienta) {
        this.numeClienta = numeClienta;
    }

    public void setOra(Integer ora) {
        this.ora = ora;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public void setAvans(boolean avans) {
        this.avans = avans;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProgramarePrototype{");
        sb.append("numeClienta='").append(numeClienta).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", pret=").append(pret);
        sb.append(", avans=").append(avans);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IProgramare copiaza() {
        ProgramarePrototype programare= new ProgramarePrototype();
        programare.numeClienta=numeClienta;
        programare.ora=ora;
        programare.pret=pret;
        programare.avans=avans;
        return programare;


    }
}
