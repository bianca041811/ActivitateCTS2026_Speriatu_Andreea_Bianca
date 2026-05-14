package ro.ase.cts.Hotel.clase;


import java.util.ArrayList;
import java.util.List;

public class Etaj implements Structura {
    private int nrEtaj;
    private List<Etaj>subsectiuni ;
    private List<Structura> camere;

    public Etaj(int nrEtaj) {
        this.nrEtaj = nrEtaj;
        this.subsectiuni = new ArrayList<>();
        this.camere = new ArrayList<>();
    }

    public void adaugaSubsectiune(Etaj etaj)
    {
        subsectiuni.add(etaj);
    }
    public void adaugaCamera(Structura structura)
    {
        camere.add(structura);
    }

    public void stergeSubsectiune(Etaj etaj)
    {
        subsectiuni.remove(etaj);
    }
    public void stergeCamera(Structura structura)
    {
        camere.remove(structura);
    }

    public Etaj getSubsectiune(int pozitie)
    {
        return subsectiuni.get(pozitie);
    }
    public Structura getCamera(int pozitie)
    {
        return camere.get(pozitie);
    }


    @Override
    public void afiseazaHotel(String spatii) {
        System.out.println(spatii + "Etajul: " + nrEtaj);
        for (Structura camera : camere) {
            camera.afiseazaHotel(spatii + "  ");
        }

        for (Etaj etaj : subsectiuni) {
            etaj.afiseazaHotel(spatii + "  ");
        }
    }
}
