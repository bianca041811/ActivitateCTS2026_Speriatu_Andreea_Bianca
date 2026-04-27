package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.ProgramareMachiaj;

public class Main {
    public static void main(String[] args) {
        ProgramareMachiaj p1 = ProgramareMachiaj.getInstanta("Ana", 10, 150, true);
        ProgramareMachiaj p2 = ProgramareMachiaj.getInstanta("Maria", 12, 200, false);

        p1.afiseazaProgramare("machiaj de zi");
        p2.afiseazaProgramare("machiaj de seara");

        if(p1 == p2){
            System.out.println("Este aceeasi instanta");
        } else {
            System.out.println("Sunt instante diferite");
        }
    }
}
