package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Client;
import ro.ase.cts.restaurant.clase.Restaurant;
import ro.ase.cts.restaurant.proxy.ProxyRezervare;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Miruna",3);
        Restaurant restaurant=new Restaurant("Arogant");

        restaurant.rezervaMasa(client);

        ProxyRezervare proxy= new ProxyRezervare(restaurant);
        proxy.rezervaMasa(client);
    }
}
