package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Eze", 21,3,"3444444444444444");
        Rezervare rezervare1 = (Rezervare) rezervare.copiaza();
        rezervare1.setOra(19);
        System.out.println(rezervare1.toString());
    }
}
