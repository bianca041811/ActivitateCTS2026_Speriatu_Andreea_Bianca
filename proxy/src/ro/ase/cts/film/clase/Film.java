package ro.ase.cts.film.clase;

public class Film implements IFilm {
    private String nume;

    public Film(String nume) {
        this.nume = nume;
    }

    @Override
    public void permiteAccesul(Client client) {
        System.out.println("Clientul "+client.getNume()+" poate viziona filmul "+this.nume);
    }
}
