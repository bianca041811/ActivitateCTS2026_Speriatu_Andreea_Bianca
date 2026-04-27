package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.programareproto.IProgramare;
import ro.ase.cts.prototype.programareproto.ProgramarePrototype;

public class Main {
    public static void main(String[] args) {

        ProgramarePrototype p1 = new ProgramarePrototype("Ana", 10, 150, true);

        IProgramare copie1 = p1.copiaza();
        IProgramare copie2 = p1.copiaza();

        System.out.println(p1.toString());
        System.out.println(copie1.toString());
        System.out.println(copie2.toString());


        ((ProgramarePrototype) copie1).setNumeClienta("Maria");
        ((ProgramarePrototype) copie1).setOra(12);

        System.out.println("\nDupa modificare copie:\n");

        System.out.println(p1.toString());
        System.out.println(copie1.toString());
        System.out.println(copie2.toString());
    }
}
