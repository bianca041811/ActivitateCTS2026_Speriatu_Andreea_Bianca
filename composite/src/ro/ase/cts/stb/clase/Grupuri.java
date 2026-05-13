package ro.ase.cts.stb.clase;

import java.util.ArrayList;
import java.util.List;

public class Grupuri implements Structura{
    private String tipGrup;
    private List<Structura> lista;

    public Grupuri(String tipGrup) {
        this.tipGrup = tipGrup;
        this.lista =new ArrayList<>();
    }

    public void adaugaGrup(Structura structura)
    {
        lista.add(structura);
    }

    public void stergeGrup(Structura structura)
    {
        lista.remove(structura);
    }

    public Structura getGrup(int pozitie)
    {
        return lista.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+"Grupul: "+tipGrup);

        for(Structura structura : lista)
        {
            structura.afiseazaDetalii(spatii + "   ");
        }
    }
}
