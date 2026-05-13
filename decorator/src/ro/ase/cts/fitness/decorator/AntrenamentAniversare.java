package ro.ase.cts.fitness.decorator;

import ro.ase.cts.fitness.clase.IAntrenament;

public class AntrenamentAniversare extends AntrenamentDecorator{
    public AntrenamentAniversare(IAntrenament antrenament) {
        super(antrenament);
    }

    @Override
    public void afiseazaOfertePromotionale() {
        System.out.println("ai primit o sedinta gratuita cu ocazia zilei tale de  nastere!");
    }
}
