package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.AutobuzAbstract;
import ro.ase.cts.stb.clase.Linie;
import ro.ase.cts.stb.clase.RegistruAutobuze;

public class Main {
    public static void main(String[] args) {
        RegistruAutobuze registru=new RegistruAutobuze();
        AutobuzAbstract autobuz= registru.getAutobuz("mercedes",2020,62);

        Linie linie1= new Linie("178","Crangasi","Piata Romana");
        Linie linie2= new Linie("162","Romaero","Baneasa");

        autobuz.afiseazaLinie(linie1);
        autobuz.afiseazaDetalii(linie1);
        autobuz.afiseazaLinie(linie2);

        registru.getAutobuz("mercedes", 2020,62).afiseazaLinie(linie2);
        registru.getAutobuz("electric",2021,30).afiseazaDetalii(linie1);

    }
}
