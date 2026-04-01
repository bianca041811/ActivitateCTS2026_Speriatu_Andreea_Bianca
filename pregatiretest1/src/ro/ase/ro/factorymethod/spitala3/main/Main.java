package ro.ase.ro.factorymethod.spitala3.main;

import ro.ase.ro.factorymethod.spitala3.clase.Personal;
import ro.ase.ro.factorymethod.spitala3.fabrici.*;

public class Main {


        public static void main(String[] args) {
            PersonalFabrica fabrica = new PersonalMedicalFabrica();
            Personal asistent = fabrica.getPersonal(TipPersonalMedical.ASISTENT,"Pop", 32);
            Personal medic = fabrica.getPersonal(TipPersonalMedical.MEDIC,"Enescu", 33);

            PersonalFabrica fabrica1 = new PersonalNonMedicalFabrica();
            Personal secretar = fabrica1.getPersonal(TipPersonalNonMedical.SECRETAR,"Ionescu",40 );
            Personal registrator = fabrica1.getPersonal(TipPersonalNonMedical.REGISTRATOR,"Georgescu",37 );

            asistent.afiseaza();
            medic.afiseaza();
            secretar.afiseaza();
            registrator.afiseaza();


    }

}
