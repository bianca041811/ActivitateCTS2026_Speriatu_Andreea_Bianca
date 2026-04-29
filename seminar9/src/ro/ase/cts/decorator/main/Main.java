package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(230.00f, "12/03/2026");
        notaDePlata.printeaza();

        int a = 1;
        NotaDePlataDecorator decorator=null;

        if(a==1){
            decorator = new NotaDePlataNoulAn(notaDePlata);
        } else if(a == 2){
            decorator = new NotaDePlata1Mai(notaDePlata);
        }

        decorator.printeaza();
        decorator.printeazaFelicitare();

    }
}
