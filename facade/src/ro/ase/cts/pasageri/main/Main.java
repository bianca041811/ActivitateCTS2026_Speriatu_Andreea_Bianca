package ro.ase.cts.pasageri.main;

import ro.ase.cts.pasageri.clase.Imbarcare;
import ro.ase.cts.pasageri.clase.VerificareBagaj;
import ro.ase.cts.pasageri.clase.VerificareBilet;
import ro.ase.cts.pasageri.clase.VerificarePasaport;
import ro.ase.cts.pasageri.facade.ImbarcareFacade;

public class Main {
    public static void main(String[] args) {
        Imbarcare imbarcare = new Imbarcare("Minulescu Maria");
        ImbarcareFacade facade= new ImbarcareFacade();

        facade.imbarcaPasager(imbarcare);


    }
}
