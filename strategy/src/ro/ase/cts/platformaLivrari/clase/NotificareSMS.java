package ro.ase.cts.platformaLivrari.clase;

public class NotificareSMS implements ModNotificare{
    @Override
    public void primesteNotificare(String numeClient) {
        System.out.println("Clientul "+numeClient+"a fost notificat prin SMS ");

    }
}
