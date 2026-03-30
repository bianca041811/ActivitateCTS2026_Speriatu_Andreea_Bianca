package ro.ase.ro.singleton.managerezervari.main;

import ro.ase.ro.singleton.managerezervari.clase.ManagerRezervari;

public class Main {
    public static void main(String[] args) {
        ManagerRezervari instance = ManagerRezervari.getInstanta("pop ana",3,13);
        instance.afiseazaManagerRezervari("managerul nu este afisat corect");
        instance.afiseazaManagerRezervari("eroare");

        ManagerRezervari instance2 = ManagerRezervari.getInstanta("mara iuliana",4,16);
        instance2.afiseazaManagerRezervari("eroare");
        instance2.setNumeClient("mara iuliana");
        instance2.setNrPersoane(4);
        instance2.setOra(16);
        instance2.afiseazaManagerRezervari("eroare la inserare");

    }
}
