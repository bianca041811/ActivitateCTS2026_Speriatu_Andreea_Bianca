package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.clase.FondDeTen;
import ro.ase.cts.simplefactory.clase.TipMachiaj;
import ro.ase.cts.simplefactory.factory.MachiajeFabrica;

public class Main {
    public static void main(String[] args) {

        MachiajeFabrica factory = new MachiajeFabrica();
        FondDeTen fondDeTen = (FondDeTen) factory.getMachiaj(TipMachiaj.FOND_DE_TEN, "maybeline", "110", 100, 50);
        fondDeTen.afiseazaTipMachiaj();
    }
}
