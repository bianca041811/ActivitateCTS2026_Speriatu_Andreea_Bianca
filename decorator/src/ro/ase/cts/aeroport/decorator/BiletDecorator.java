package ro.ase.cts.aeroport.decorator;

import ro.ase.cts.aeroport.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract {
    private BiletAbstract bilet;

    public BiletDecorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
    }
    public abstract void adaugaFelicitare();
}
