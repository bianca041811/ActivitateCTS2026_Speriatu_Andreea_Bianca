package ro.ase.ro.singleton.managerspital.main;

import ro.ase.ro.singleton.managerspital.clase.ManagerSpital;

public class Main {
    public static void main(String[] args) {
        ManagerSpital instance = ManagerSpital.getInstanta("Pop Mara", 32, 3500);
        instance.afiseazaManager("managerul nu e afisat corect");
        instance.afiseazaManager("eroare");

        ManagerSpital instance2 = ManagerSpital.getInstanta("Ana Maia", 43, 6789);
        instance2.afiseazaManager("eroare");

        instance2.setNume("Ana Maia");
        instance2.setVarsta(43);
        instance2.setSalariul(6789);
        instance2.afiseazaManager("eroare la afisare");
    }
}
