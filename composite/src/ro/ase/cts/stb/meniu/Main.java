package ro.ase.cts.stb.meniu;

import ro.ase.cts.stb.clase.Autobuz;
import ro.ase.cts.stb.clase.Grupuri;
import ro.ase.cts.stb.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Grupuri flota= new Grupuri("Flota");

        Grupuri grupuriMici= new Grupuri("Grupuri mici");
        Grupuri grupuriMedii= new Grupuri("Grupuri medii");
        Grupuri grupuriMari = new Grupuri("Grupuri mari");

        Structura autobuz1= new Autobuz("Mercedes",10);
        Structura autobuz2 = new Autobuz("Dacia",30);
        Structura autobuz3 = new Autobuz("BMW",50);

        grupuriMici.adaugaGrup(autobuz1);
        grupuriMedii.adaugaGrup(autobuz2);
        grupuriMari.adaugaGrup(autobuz3);

        flota.adaugaGrup(grupuriMici);
        flota.adaugaGrup(grupuriMedii);
        flota.adaugaGrup(grupuriMari);

        flota.afiseazaDetalii("   ");
    }
}
