package ro.ase.ro.factorymethod.spitala3.fabrici;

import ro.ase.ro.factorymethod.spitala3.clase.Personal;
import ro.ase.ro.factorymethod.spitala3.clase.Secretar;

public interface PersonalFabrica {
    public Personal getPersonal(TipPersonal tip, String nume, Integer varsta, Integer salariul);
    public Personal getPersonal(TipPersonal tip, String nume, Integer varsta);

}
