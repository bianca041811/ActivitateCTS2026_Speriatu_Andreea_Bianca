package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.clase.*;

public class MachiajeFabrica {
    public Machiaj getMachiaj(TipMachiaj tip, String marca, String nuanta, Integer gramaj, Integer pret)
    {
        switch (tip){
            case TipMachiaj.FOND_DE_TEN:
                return new FondDeTen(marca, nuanta,gramaj, pret);
            case TipMachiaj.BLUSH:
                return new Blush(marca, nuanta,gramaj, pret);
            case TipMachiaj.ILUMINATOR:
                return new Iluminator(marca, nuanta,gramaj, pret);
            default: return null;

        }
    }
}
