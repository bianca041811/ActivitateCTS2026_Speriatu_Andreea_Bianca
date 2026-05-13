package ro.ase.cts.universitate.clase;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Facultate implements Structura{
    private String numeFacultate;
    private List<Structura>lista;

    public Facultate(String numeFacultate) {
        this.numeFacultate = numeFacultate;
        this.lista = new ArrayList<>();
    }

    public void adaugaSectiune(Structura structura)
    {
        lista.add(structura);
    }

    public void stergeSectiune(Structura structura)
    {
        lista.remove(structura);
    }

    public Structura getSectiune(int pozitie)
    {
        return lista.get(pozitie);
    }


    @Override
    public void afiseazaInformatii(String spatii) {
        System.out.println(spatii +"Facultatea: "+numeFacultate);
        for(Structura structura: lista)
        {
            structura.afiseazaInformatii(spatii+"   ");
        }
    }
}
