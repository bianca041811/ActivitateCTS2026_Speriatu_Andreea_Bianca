package ro.ase.ro.builder.restaurantb2.main;

import ro.ase.ro.builder.restaurantb2.clase.Rezervare;
import ro.ase.ro.builder.restaurantb2.clase.RezervareBuilder;
import ro.ase.ro.builder.restaurantb2.clase.RezervareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare(true, true, true, true, "Mihai Popescu");
        Rezervare rezervare2 = new Rezervare(false, false, false, false, "Mihai Popescu");
        RezervareBuilder builder = new RezervareBuilder(("Ana Popa"));
        Rezervare rezervare3 = builder.build();
        Rezervare rezervare4 = builder.setNumeClient("Mihai Popescu").setMasaLaGeam(true).setScauneErgonomice(true).setMuzica(true).setDecor(true).build();
        System.out.println(rezervare3.toString());
        System.out.println(rezervare4.toString());

        RezervareBuilderAlternativ builderAlternativ = new RezervareBuilderAlternativ(("Ana Popescu"));
        builderAlternativ.setMasaLaGeam(true);
        Rezervare rezervare101 = builderAlternativ.build("Ionescu");
        Rezervare rezervare102 = builderAlternativ.build("Enescu");
        Rezervare rezervare103 = builderAlternativ.build("Georgescu");
        System.out.println(rezervare101.toString());


    }

}
