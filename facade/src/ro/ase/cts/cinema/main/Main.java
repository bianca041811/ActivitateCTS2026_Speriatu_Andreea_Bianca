package ro.ase.cts.cinema.main;

import ro.ase.cts.cinema.clase.Cinema;
import ro.ase.cts.cinema.facade.CinemaFacade;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("VIP");
        CinemaFacade facade= new CinemaFacade();

        facade.verificaIntrare(cinema);
    }
}
