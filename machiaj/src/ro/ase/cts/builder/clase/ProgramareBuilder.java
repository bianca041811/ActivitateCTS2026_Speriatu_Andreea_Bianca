package ro.ase.cts.builder.clase;

public class ProgramareBuilder implements ProgramareBuilderAbstract{
    private Programare programare;

    public ProgramareBuilder(String nume) {
        this.programare=new Programare(false, false, false, nume);
    }
    public ProgramareBuilder setMachiajproba(boolean areMachiajproba) {
        programare.machiajproba = areMachiajproba;
        return this;
    }

    public ProgramareBuilder setFondDeTenPremium(boolean areFondDeTenPremium) {
        programare.fondDeTenPremium = areFondDeTenPremium;
        return this;
    }

    public ProgramareBuilder setAvans(boolean areAvans) {
        programare.avans = areAvans;
        return this;
    }

    public ProgramareBuilder setNumeClienta(String areNumeClienta) {
        programare.numeClienta = areNumeClienta;
        return this;
    }

    @Override
    public Programare build() {
       return this.programare;
    }
}
