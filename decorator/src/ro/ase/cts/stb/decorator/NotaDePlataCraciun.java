package ro.ase.cts.stb.decorator;


import ro.ase.cts.stb.clase.NotaDePlataAbstract;

public class NotaDePlataCraciun extends NotaDePlataDecorator{
    public NotaDePlataCraciun(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Craciun Fericit!");
    }
}
