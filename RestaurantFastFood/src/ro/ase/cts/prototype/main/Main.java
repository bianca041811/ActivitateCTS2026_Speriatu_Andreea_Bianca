package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.BurgerPrestabilit;
import ro.ase.cts.prototype.clase.IBurgerPrestabilit;

public class Main {
    public static void main(String[] args) {

        BurgerPrestabilit burgerPrestabilit = new BurgerPrestabilit("burger standard", 500, 35);
        BurgerPrestabilit burger2 = (BurgerPrestabilit) burgerPrestabilit.copiaza();
        burger2.setPret(49);
        System.out.println(burger2.toString());
    }
}
