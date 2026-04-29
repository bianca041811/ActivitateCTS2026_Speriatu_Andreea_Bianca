package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator {
    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("\nLa multi ani de Anul Nou!");
    }
}
