package ro.ase.cts.netflix.clase;

public class PlatformaStreeming implements IPlatforma{
    private String nume;

    public PlatformaStreeming(String nume) {
        this.nume = nume;
    }


    @Override
    public void permiteAccesFilm(Abonat abonat) {
        System.out.println("Abonatul "+abonat.getNume()+"poate viziona filme pe platforma "+this.nume);
    }
}
