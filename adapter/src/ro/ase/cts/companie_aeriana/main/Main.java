package ro.ase.cts.companie_aeriana.main;

import ro.ase.cts.companie_aeriana.aplicatie_noua.AdaptorVerificareNoua;
import ro.ase.cts.companie_aeriana.aplicatie_noua.VerificareNoua;
import ro.ase.cts.companie_aeriana.aplicatie_veche.VerificareVeche;

public class Main {
    public static void verifica(VerificareVeche verificareVeche){verificareVeche.verificaPasaport();}

    public static void main(String[] args) {
        VerificareVeche verificareVeche=new VerificareVeche();
        VerificareNoua verificareNoua = new VerificareNoua();

        verifica(verificareVeche);

        AdaptorVerificareNoua verificareAdaptata= new AdaptorVerificareNoua(verificareNoua);
        verifica(verificareAdaptata);
    }
}
