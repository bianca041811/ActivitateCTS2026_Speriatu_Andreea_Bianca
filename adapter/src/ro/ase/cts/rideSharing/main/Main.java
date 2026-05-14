package ro.ase.cts.rideSharing.main;

import ro.ase.cts.rideSharing.aplicatieNoua.AdapterAplicatieNoua;
import ro.ase.cts.rideSharing.aplicatieNoua.AplicatieNoua;
import ro.ase.cts.rideSharing.aplicatieVeche.AplicatieVeche;

public class Main {
    public static void calculeazaCost(AplicatieVeche aplicatieVeche){aplicatieVeche.calculCostVechi();}
    public static void main(String[] args) {
        AplicatieNoua aplicatieNoua= new AplicatieNoua();
        AplicatieVeche aplicatieVeche= new AplicatieVeche();

        aplicatieVeche.calculCostVechi();
        aplicatieNoua.calculCostAI();

        calculeazaCost(aplicatieVeche);
        AdapterAplicatieNoua aplicatieAdaptata = new AdapterAplicatieNoua(aplicatieNoua);
        calculeazaCost(aplicatieAdaptata);
    }
}
