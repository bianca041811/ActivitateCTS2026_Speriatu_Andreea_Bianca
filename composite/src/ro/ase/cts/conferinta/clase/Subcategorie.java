package ro.ase.cts.conferinta.clase;

import java.util.ArrayList;
import java.util.List;

public class Subcategorie implements Structura{
    private String numeSubcategorie;
    private List<Subcategorie> subcategorii;
    private List<Structura> lista;

    public Subcategorie(String numeSubcategorie) {
        this.numeSubcategorie = numeSubcategorie;
        this.subcategorii = new ArrayList<>();
        this.lista = new ArrayList<>();
    }

    public void adaugaSubcategorie(Subcategorie subcategorie)
    {
        subcategorii.add(subcategorie);
    }
    public void adaugaStructura(Structura structura)
    {
        lista.add(structura);
    }
    public void stergeSubcategorie(Subcategorie subcategorie)
    {
        subcategorii.remove(subcategorie);
    }
    public void stergeStructura(Structura structura)
    {
        lista.remove(structura);
    }


    public Subcategorie getSubcategorie(int pozitie)
    {
        return subcategorii.get(pozitie);
    }
    public Structura getStructura(int pozitie)
    {
        return lista.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+"Subcategoria: "+numeSubcategorie);
        for(Structura structura:lista)
        {
            structura.afiseazaDetalii(spatii+"   ");
        }
        for(Subcategorie subcategorie:subcategorii)
        {
            subcategorie.afiseazaDetalii(spatii+"   ");
        }
    }
}
