package ro.ase.cts.platformaLivrari.clase;

public class NotificareAplicatie implements ModNotificare{
    @Override
    public void primesteNotificare(String numeClient) {
        System.out.println("Clientul "+numeClient+" a fost notificat prin aplicatie ");
    }
}
