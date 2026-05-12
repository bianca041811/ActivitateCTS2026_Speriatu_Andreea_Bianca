package ro.ase.cts.curier.main;

import ro.ase.cts.curier.sistem_nou.AdapterSistemNou;
import ro.ase.cts.curier.sistem_nou.SistemNou;
import ro.ase.cts.curier.sistem_vechi.SistemVechi;

public class Main {
    public static void main(String[] args) {
        SistemVechi comanda1=new SistemVechi();
        SistemNou comanda2= new SistemNou();

        comanda1.platesteComanda();
        comanda2.executaPlata();

        AdapterSistemNou comandaAdaptata=new AdapterSistemNou(comanda2);
        comandaAdaptata.platesteComanda();
    }
}
