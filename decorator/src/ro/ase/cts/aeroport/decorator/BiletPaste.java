package ro.ase.cts.aeroport.decorator;

import ro.ase.cts.aeroport.clase.BiletAbstract;

public class BiletPaste extends BiletDecorator {

    public BiletPaste(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void adaugaFelicitare() {
        System.out.println("Paste fericit");
    }
}
