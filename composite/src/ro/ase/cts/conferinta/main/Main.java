package ro.ase.cts.conferinta.main;

import ro.ase.cts.conferinta.clase.Participant;
import ro.ase.cts.conferinta.clase.Structura;
import ro.ase.cts.conferinta.clase.Subcategorie;

public class Main {
    public static void main(String[] args) {

        Subcategorie conferinta = new Subcategorie("Conferinta");
        Subcategorie ase = new Subcategorie("ASE");
        Subcategorie vip = new Subcategorie("VIP");

        Structura participant1 =
                new Participant("Ionescu", "CSIE");

        Structura participantVIP =
                new Participant("Popescu", "Google");

        ase.adaugaStructura(participant1);

        vip.adaugaStructura(participantVIP);

        conferinta.adaugaSubcategorie(ase);
        conferinta.adaugaSubcategorie(vip);

        conferinta.afiseazaDetalii("");
    }
}
