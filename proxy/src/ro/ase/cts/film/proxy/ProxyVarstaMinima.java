package ro.ase.cts.film.proxy;

import ro.ase.cts.film.clase.Client;
import ro.ase.cts.film.clase.IFilm;

public class ProxyVarstaMinima implements IFilm {
    private IFilm film;

    public ProxyVarstaMinima(IFilm film) {
        this.film = film;
    }

    @Override
    public void permiteAccesul(Client client) {
        if(client.getVarsta()>=7)
        {
            film.permiteAccesul(client);
        }
        else
        {
            System.out.println("Clientul NU poate viziona filmul. Va afla ca nu exista Mos Craciun!");
        }
    }
}
