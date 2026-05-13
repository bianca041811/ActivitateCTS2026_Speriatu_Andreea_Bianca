package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.NotaDePlata;
import ro.ase.cts.stb.clase.NotaDePlataAbstract;
import ro.ase.cts.stb.decorator.NotaDePlataCraciun;
import ro.ase.cts.stb.decorator.NotaDePlataDecorator;
import ro.ase.cts.stb.decorator.NotaDePlataPaste;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata= new NotaDePlata(110.00f,"12.12.2022");
        notaDePlata.printeaza();

        int a=2;
        NotaDePlataDecorator decorator= null;
        if(a==1)
        {
            decorator= new NotaDePlataCraciun(notaDePlata);
        }
        else if(a==2)
        {
            decorator= new NotaDePlataPaste(notaDePlata);
        }

        decorator.printeaza();
        decorator.printeazaFelicitare();
    }
}
