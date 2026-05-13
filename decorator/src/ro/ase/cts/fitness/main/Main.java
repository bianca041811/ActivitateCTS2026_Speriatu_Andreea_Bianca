package ro.ase.cts.fitness.main;

import ro.ase.cts.fitness.clase.Antrenament;
import ro.ase.cts.fitness.clase.IAntrenament;
import ro.ase.cts.fitness.decorator.AntrenamentAniversare;
import ro.ase.cts.fitness.decorator.AntrenamentDecorator;
import ro.ase.cts.fitness.decorator.AntrenamentSpecial;

public class Main {
    public static void main(String[] args) {
        IAntrenament antrenament=new Antrenament("12 februarie ","12:00");
        antrenament.afiseaza();

        int a=1;
        AntrenamentDecorator decorator= null;
        if(a==1)
        {
            decorator=new AntrenamentAniversare(antrenament);
        }
        else if(a==2)
        {
            decorator=new AntrenamentSpecial(antrenament);
        }

        decorator.afiseaza();;
        decorator.afiseazaOfertePromotionale();
    }
}
