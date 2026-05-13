package ro.ase.cts.fitness.decorator;

import ro.ase.cts.fitness.clase.IAntrenament;

public class AntrenamentSpecial extends AntrenamentDecorator{
    public AntrenamentSpecial(IAntrenament antrenament) {
        super(antrenament);
    }

    @Override
    public void afiseazaOfertePromotionale() {
        System.out.println("Felicitari astazi poti avea un antrenament special alaturi de un antrenor");
    }
}
