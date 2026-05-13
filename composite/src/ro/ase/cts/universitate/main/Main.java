package ro.ase.cts.universitate.main;

import ro.ase.cts.universitate.clase.Structura;
import ro.ase.cts.universitate.clase.Facultate;
import ro.ase.cts.universitate.clase.Profesor;

public class Main {
    public static void main(String[] args) {
        Facultate universitate = new Facultate("ASE");

        Facultate marketing = new Facultate("Marketing");
        Facultate management = new Facultate("Management");
        Facultate csie = new Facultate("CSIE");


        Structura profesor1= new Profesor("Ionescu Mircea","JAVA");
        Structura profesor2= new Profesor("Radulescu Mihaela","POO");
        Structura profesor3 =  new Profesor("Popescu Ana","SDD");

        marketing.adaugaSectiune(profesor1);
        management.adaugaSectiune(profesor2);
        csie.adaugaSectiune(profesor3);

        universitate.adaugaSectiune(management);
        universitate.adaugaSectiune(marketing);
        universitate.adaugaSectiune(csie);


        universitate.afiseazaInformatii("   ");


    }
}
