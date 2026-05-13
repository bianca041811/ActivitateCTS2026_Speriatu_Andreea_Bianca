package ro.ase.cts.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Meniu{
    private String numeSectiune;
    private List<Meniu> lista;

    public Sectiune(String numeSectiune ) {
        this.numeSectiune = numeSectiune;
        this.lista = new ArrayList<>();
    }
    public void adaugaSectiune(Meniu meniu)
    {
        lista.add(meniu);
    }
    public void stergeSectiune(Meniu meniu)
    {
        lista.remove(meniu);
    }

    public Meniu getSectiune(int pozitie)
    {
        return lista.get(pozitie);
    }

    @Override
    public void afiseazaMeniu(String spatii) {
        System.out.println(spatii+"Sectiunea: "+this.numeSectiune);
        for(Meniu meniu: lista)
        {
            meniu.afiseazaMeniu(spatii +"  ");
        }
    }
}
