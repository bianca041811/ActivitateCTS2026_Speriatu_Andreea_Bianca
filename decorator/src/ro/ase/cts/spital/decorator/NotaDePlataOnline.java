package ro.ase.cts.spital.decorator;

import ro.ase.cts.spital.clase.NotaDePlataAbstract;

public class NotaDePlataOnline extends NotaDePlataDecorator{
    public NotaDePlataOnline(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("Ati primit notaDePlataOnline cu succes!");
    }
}
