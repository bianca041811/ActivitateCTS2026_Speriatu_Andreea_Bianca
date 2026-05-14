package ro.ase.cts.biblioteca.clase;

public class Carte implements Structura{
    private String titlu;
    private String autor;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    @Override
    public void afiseazaCatalogCarti(String spatii) {
        System.out.println(spatii+"Cartea "+titlu+" a fost scrisa de "+autor);

    }
}
