package ro.ase.ro.factorymethod.spitala3.clase;

public abstract class PersonalNonMedical implements Personal {
    protected Integer varsta;
    protected String nume;
    protected Integer salariul;

    public PersonalNonMedical(String nume,  Integer varsta,Integer salariul) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariul = salariul;
    }
}
