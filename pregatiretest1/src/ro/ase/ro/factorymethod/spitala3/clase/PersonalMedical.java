package ro.ase.ro.factorymethod.spitala3.clase;

public abstract class PersonalMedical implements Personal{
    protected Integer varsta;
    protected String nume;

    public PersonalMedical(Integer varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

}
