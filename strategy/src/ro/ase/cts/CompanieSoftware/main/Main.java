package ro.ase.cts.CompanieSoftware.main;

import ro.ase.cts.CompanieSoftware.clase.AutentificareAmprenta;
import ro.ase.cts.CompanieSoftware.clase.AutetificareParola;
import ro.ase.cts.CompanieSoftware.clase.Utilizator;

public class Main {
    public static void main(String[] args) {
        Utilizator utilizator=  new Utilizator("Bianca");
        utilizator.autentificaClient();

        utilizator.setModAutentificare(new AutetificareParola());
        utilizator.autentificaClient();
    }
}
