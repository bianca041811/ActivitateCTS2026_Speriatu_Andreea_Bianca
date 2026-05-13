package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.Calator;
import ro.ase.cts.stb.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator= new Calator("Miriam");
        calator.platesteTranzactie(110.00f);
        calator.setModalitatePlata(new PlataSMS());
        calator.platesteTranzactie(120.00f);
    }

}
