package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Bianca");
        client.platesteTranzactie(230.9);

        client.setModalitateDePlata(new PlataCash());
        client.platesteTranzactie(129.5);
    }
}
