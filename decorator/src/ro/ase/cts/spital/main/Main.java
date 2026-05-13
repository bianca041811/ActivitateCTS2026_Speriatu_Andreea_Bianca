package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.NotaDePlata;
import ro.ase.cts.spital.clase.NotaDePlataAbstract;
import ro.ase.cts.spital.decorator.NotaDePlataDecorator;
import ro.ase.cts.spital.decorator.NotaDePlataOnline;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata= new NotaDePlata(220.00f,"10/09/2025");
        notaDePlata.printeaza();

        NotaDePlataDecorator decorator= new NotaDePlataOnline(notaDePlata);
        decorator.afiseazaOnline();
    }

}
