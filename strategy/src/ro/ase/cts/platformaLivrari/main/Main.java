package ro.ase.cts.platformaLivrari.main;

import ro.ase.cts.platformaLivrari.clase.Client;
import ro.ase.cts.platformaLivrari.clase.NotificareMail;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ana");
        client.primesteNotificareClient();
        client.setModNotificare(new NotificareMail());
        client.primesteNotificareClient();
    }
}
