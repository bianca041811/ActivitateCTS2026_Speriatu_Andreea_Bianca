package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {

        Structura depSpital=new Departament("Spital");//asa trebuie sa fie e eroare din clase
        Structura depAdministrativ=new Departament("Administrativ");
        Structura sectieSecretariat= new Sectie("Secretariat",10);
        Structura sectieManagement= new Sectie("Management",3);

        ( (Departament)depSpital).adaugaStructura(depAdministrativ);
        ( (Departament)depSpital).adaugaStructura(sectieManagement);
        ( (Departament)depSpital).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ( (Departament)depSpital).stergeStructura(sectieManagement);
        ( (Departament)depAdministrativ).adaugaStructura(sectieManagement);
        System.out.println("\nDupa modificare");
        depSpital.afiseazaDetaliiStructura("");



    }
}
