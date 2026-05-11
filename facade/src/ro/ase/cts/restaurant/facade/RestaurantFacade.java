package ro.ase.cts.restaurant.facade;

import ro.ase.cts.restaurant.clase.Masa;

public class RestaurantFacade {
    public void verificaMasa(Masa masa) {
        if (masa.esteLibera()) {
            if (masa.esteDebarasata()) {
                if (masa.areServeteleNoi()) {
                    System.out.println("Masa " + masa.getNrMasa() + " este pregatita.");
                } else {
                    System.out.println("Masa nu are servetele noi.");
                }
            } else {
                System.out.println("Masa nu este debarasata.");
            }
        } else {
            System.out.println("Masa nu este libera.");
        }
    }
}
