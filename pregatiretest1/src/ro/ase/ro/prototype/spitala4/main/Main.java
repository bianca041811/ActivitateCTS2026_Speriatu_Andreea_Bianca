package ro.ase.ro.prototype.spitala4.main;

import ro.ase.ro.prototype.spitala4.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta("antibiotic",2,"O3");
        Reteta reteta1 = (Reteta) reteta.copiaza();
        reteta1.setCantitateSolutie(3);
        System.out.println(reteta1.toString());
    }
}
