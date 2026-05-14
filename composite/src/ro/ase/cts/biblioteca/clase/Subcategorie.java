package ro.ase.cts.biblioteca.clase;

import java.util.ArrayList;
import java.util.List;

public class Subcategorie implements Structura{
    private String nume;
    private List<Structura> lista;

    public Subcategorie(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public void adaugaCagorie(Structura structura)
    {
        lista.add(structura);
    }
    public void stergeCagorie(Structura structura)
    {
        lista.remove(structura);
    }

    public Structura getCarte(int pozitie)
    {
        return lista.get(pozitie);
    }
    @Override
    public void afiseazaCatalogCarti(String spatii) {
        System.out.println(spatii+"Subcategoria: "+nume);
        for(Structura structura: lista)
        {
            structura.afiseazaCatalogCarti(spatii+"  ");
        }

    }
}
