package ro.ase.cts.spitalNou.main;

import ro.ase.cts.spitalNou.clase.Internare;
import ro.ase.cts.spitalNou.facade.InternareFacade;

public class Main {
    public static void main(String[] args) {
        Internare internare= new Internare("101");
        InternareFacade facade = new InternareFacade();

        facade.verifica(internare);

    }
}
