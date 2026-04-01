package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.burgeri.*;

public class Factory {
    public IBurger getBurger(TipBurger tip, String nume, Integer gramaj,Integer pret)
    {
        switch (tip)
        {
            case TipBurger.BURGER_PUI ->
            {
                BurgerPui burgerPui=new BurgerPui(nume,gramaj,pret);
                return new BurgerPui(nume,gramaj,pret);

            }
            case TipBurger.BURGER_VITA ->
            {
                BurgerVita burgerVita=new BurgerVita(nume,gramaj,pret);
                return new BurgerVita(nume,gramaj,pret);

            }
            case TipBurger.BURGER_VEGAN ->
            {
                BurgerVegan burgerVegan=new BurgerVegan(nume,gramaj,pret);
                return new BurgerVegan(nume,gramaj,pret);

            }
            default->{return null;}
        }
    }
}
