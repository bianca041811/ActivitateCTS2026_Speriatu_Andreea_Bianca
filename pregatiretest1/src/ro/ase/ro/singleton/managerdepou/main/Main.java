package ro.ase.ro.singleton.managerdepou.main;

import ro.ase.ro.singleton.managerdepou.clase.ManagerDepou;

public class Main {
    public static void main(String[] args) {
        ManagerDepou instanta= ManagerDepou.getInstanta("Miitari",123,"Bucuresti");
        instanta.afiseazaDepou("Depoul nu este afisat corect");
        instanta.afiseazaDepou("Eroare");

        ManagerDepou instanta2 = ManagerDepou.getInstanta("Straulesti",43,"Bucuresti");
        instanta2.afiseazaDepou("Eroare");
        instanta2.setNumeDepou("Straulesti");
        instanta2.setNrAutobuze(43);
        instanta2.setOras("Bucuresti");
        instanta2.afiseazaDepou("Eroare la afisare");


    }
}
