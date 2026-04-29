package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDep;
    private List<Structura>subStructuraList;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuraList = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura)
    {
        subStructuraList.add(structura);
    }
    public void stergeStructura(Structura structura)
    {
        subStructuraList.remove(structura);
    }
    public Structura getStructura(int pozitie)
    {
        return subStructuraList.get(pozitie);
    }
    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume Dep:"+this.numeDep);
        for(Structura structura: subStructuraList){
            structura.afiseazaDetaliiStructura(spatii+" ");
        }
    }


}
