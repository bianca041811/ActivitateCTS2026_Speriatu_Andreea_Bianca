package ro.ase.cts.main;

import ro.ase.cts.clase.Ciorba;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.SupaCrema;
import ro.ase.cts.fabrici.*;
//factory Method
//psvm
public class Main {
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema = fabrica.getFelDeMancare(TipSupa.SUPA_CREMA,300, "supaMorcovi");
        FelDeMancare ciorba = fabrica.getFelDeMancare(TipSupa.CIORBA,300, "ciorbaDePui");

        FelDeMancareFabrica fabrica1 = new DesertFabrica();
        FelDeMancare papanasi = fabrica1.getFelDeMancare(TipDesert.PAPANASI,300, "PapanasiCuDulceata");
        FelDeMancare clatite = fabrica1.getFelDeMancare(TipDesert.CLATITE,300, "PapanasiCuBanane");

        supaCrema.afiseaza();
        ciorba.afiseaza();
        papanasi.afiseaza();
        clatite.afiseaza();

    }
}
