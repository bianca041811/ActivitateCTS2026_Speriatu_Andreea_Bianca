package ro.ase.cts.fitness.decorator;

import ro.ase.cts.fitness.clase.IAntrenament;

public abstract class AntrenamentDecorator implements IAntrenament {
    private IAntrenament antrenament;

    public AntrenamentDecorator(IAntrenament antrenament) {
        this.antrenament = antrenament;
    }

    @Override
    public void afiseaza() {
        antrenament.afiseaza();
    }

    public abstract void afiseazaOfertePromotionale();
}
