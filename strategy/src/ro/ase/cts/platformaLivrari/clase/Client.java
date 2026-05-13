package ro.ase.cts.platformaLivrari.clase;

public class Client {
    private String nume;
    private ModNotificare modNotificare;

    public Client(String nume) {
        this.nume = nume;
        this.modNotificare =new NotificareAplicatie();
    }

    public void setModNotificare(ModNotificare modNotificare) {
        this.modNotificare = modNotificare;
    }

    public void primesteNotificareClient(){modNotificare.primesteNotificare(nume);}
}
