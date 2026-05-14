package ro.ase.cts.aeroport.decorator;

import ro.ase.cts.aeroport.clase.BiletAbstract;

public class BiletCraciun extends BiletDecorator{
    public BiletCraciun(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void adaugaFelicitare() {
        System.out.println("Craciun Fericit");
    }
}
