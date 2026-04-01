package ro.ase.ro.factorymethod.spitala3.fabrici;

import ro.ase.ro.factorymethod.spitala3.clase.Asistent;
import ro.ase.ro.factorymethod.spitala3.clase.Brancardier;
import ro.ase.ro.factorymethod.spitala3.clase.Medic;
import ro.ase.ro.factorymethod.spitala3.clase.Personal;

public class PersonalMedicalFabrica implements PersonalFabrica{


    public Personal getPersonal(TipPersonal tip,String nume,Integer varsta)
    {
        switch(tip) {
            case TipPersonalMedical.ASISTENT:
                return new Asistent(varsta, nume);

            case TipPersonalMedical.BRANCARDIER:
                return new Brancardier(varsta, nume);
            case TipPersonalMedical.MEDIC:
                return new Medic(varsta, nume);
            default:
                return null;

        }
    }

    @Override
    public Personal getPersonal(TipPersonal tip, String nume, Integer varsta, Integer salariul) {
        return this.getPersonal(tip, nume,varsta);
    }


}
