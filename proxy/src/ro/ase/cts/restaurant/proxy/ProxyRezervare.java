package ro.ase.cts.restaurant.proxy;

import ro.ase.cts.restaurant.clase.Client;
import ro.ase.cts.restaurant.clase.IRestaurant;

public class ProxyRezervare implements IRestaurant{
    private IRestaurant restaurant;

    public ProxyRezervare(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(Client client) {
        if(client.getNrPersoane()>=4)
        {
            restaurant.rezervaMasa(client);
        }
        else {
            System.out.println("Clientul nu are rezervare");
        }
    }

}
