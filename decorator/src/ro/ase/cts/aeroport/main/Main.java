package ro.ase.cts.aeroport.main;

import ro.ase.cts.aeroport.clase.Bilet;
import ro.ase.cts.aeroport.clase.BiletAbstract;
import ro.ase.cts.aeroport.decorator.BiletCraciun;
import ro.ase.cts.aeroport.decorator.BiletDecorator;
import ro.ase.cts.aeroport.decorator.BiletPaste;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet= new Bilet(213.00f);
        bilet.printeazaBilet();


        int a=1;
        BiletDecorator decorator=null;
        if(a==1)
        {
            decorator=new BiletCraciun(bilet);

        } else if(a==2)
        {
            decorator=new BiletPaste(bilet);

        }

        decorator.printeazaBilet();
        decorator.adaugaFelicitare();
    }
}
