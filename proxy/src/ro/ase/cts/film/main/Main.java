package ro.ase.cts.film.main;

import ro.ase.cts.film.clase.Client;
import ro.ase.cts.film.clase.Film;
import ro.ase.cts.film.proxy.ProxyVarstaMinima;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Miruna",5);
        Film film =new Film("Expeditie in Laponia");

        film.permiteAccesul(client);

        ProxyVarstaMinima proxy = new ProxyVarstaMinima(film);
        proxy.permiteAccesul(client);
    }

}
