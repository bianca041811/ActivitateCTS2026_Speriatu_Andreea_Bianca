package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.burgeri.*;
import ro.ase.cts.simplefactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory= new Factory();
        IBurger burger1 =(BurgerPui)factory.getBurger(TipBurger.BURGER_PUI, "Burger special",500,40);
        IBurger burger2 =(BurgerVita)factory.getBurger(TipBurger.BURGER_VITA, "Burger de vita",500,45);
        IBurger burger3 =(BurgerVegan)factory.getBurger(TipBurger.BURGER_VEGAN, "Burger Veggie",500,50);
        IBurger burger4 =(BurgerPui)factory.getBurger(TipBurger.BURGER_PUI, "Burger misterios",500,40);

        burger1.afiseazaBurger();
        burger2.afiseazaBurger();
        burger3.afiseazaBurger();
        burger4.afiseazaBurger();

    }
}
