package ro.ase.cts.stb.decorator;

import ro.ase.cts.stb.clase.NotaDePlataAbstract;

public class NotaDePlataPaste extends NotaDePlataDecorator{
    public NotaDePlataPaste(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Paste fericit!");
    }
}
