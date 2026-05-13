package ro.ase.cts.catalogMagazin.clase;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura{
    private String tipProdus;
    private List<Structura>lista;

    public Categorie(String tipProdus) {
        this.tipProdus = tipProdus;
        this.lista =new ArrayList<>();

    }

    public void adaugaCategorie(Structura structura)
    {
        lista.add(structura);
    }

    public void stergeCategorie(Structura structura)
    {
        lista.remove(structura);
    }
    public Structura getCategorie(int pozitie)
    {
        return lista.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + "Categoria: "+tipProdus);
        for(Structura structura:lista)
        {
            structura.afiseazaDetalii(spatii +"   ");
        }
    }
}
