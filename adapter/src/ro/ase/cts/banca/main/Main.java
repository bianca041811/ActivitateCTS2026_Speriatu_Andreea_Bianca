package ro.ase.cts.banca.main;

import ro.ase.cts.banca.aplicatieNoua.AdapterAplicatieNoua;
import ro.ase.cts.banca.aplicatieNoua.AplicatieNoua;
import ro.ase.cts.banca.aplicatieVeche.AplicatieVeche;


public class Main {
    public static void verifica(AplicatieVeche aplicatieVeche){aplicatieVeche.verificaIndentitateCNP();}
    public static void main(String[] args) {
        AplicatieNoua aplicatieNoua= new AplicatieNoua();
        AplicatieVeche aplicatieVeche = new AplicatieVeche();

        verifica(aplicatieVeche);

        AdapterAplicatieNoua verificareAdaptata= new AdapterAplicatieNoua(aplicatieNoua);

        verifica(verificareAdaptata);
    }
}
