package ro.ase.ro.factorymethod.spitala3.fabrici;

import ro.ase.ro.factorymethod.spitala3.clase.Personal;
import ro.ase.ro.factorymethod.spitala3.clase.Registrator;
import ro.ase.ro.factorymethod.spitala3.clase.Secretar;

public class PersonalNonMedicalFabrica implements PersonalFabrica{
    @Override
    public Personal getPersonal(TipPersonal tip, String nume, Integer varsta) {
        return this.getPersonal(tip, nume,varsta,4000);
    }

    @Override
    public Personal getPersonal(TipPersonal tip, String nume, Integer salariul,Integer varsta) {
        switch (tip){
            case TipPersonalNonMedical.SECRETAR:
                return new Secretar(nume,salariul,varsta);
            case TipPersonalNonMedical.REGISTRATOR:
                return new Registrator(nume,salariul, varsta);
            default : return null;

        }
    }
}
