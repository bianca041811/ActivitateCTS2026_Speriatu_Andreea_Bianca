package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Masa;
import ro.ase.cts.restaurant.facade.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, true, false, true);

        RestaurantFacade facade = new RestaurantFacade();

        facade.verificaMasa(masa1);
        facade.verificaMasa(masa2);
    }
}
