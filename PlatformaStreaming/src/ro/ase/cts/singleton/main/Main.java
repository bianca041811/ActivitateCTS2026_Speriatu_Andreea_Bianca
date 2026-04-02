package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Abonament;

public class Main {
    public static void main(String[] args) {
        Abonament abonament= Abonament.getInstanta("Premium",75);
        abonament.afiseazaAbonament("Abonamentul nu e afisat corect");
        abonament.afiseazaAbonament("Eroare");
        Abonament abonament2= abonament.getInstanta("Family",60);




    }
}
