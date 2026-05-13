package ro.ase.cts.platformaLivrari.clase;

public class NotificareMail implements ModNotificare{
    @Override
    public void primesteNotificare(String numeClient) {
        System.out.println("Clientul "+numeClient+"a fost notificat pe mail ");

    }
}
