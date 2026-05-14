package ro.ase.cts.CompanieSoftware.clase;

public class Utilizator {
    private String nume ;
    private ModAutentificare modAutentificare;

    public Utilizator(String nume) {
        this.nume = nume;
        this.modAutentificare = new AutentificareAmprenta();
    }

    public void setModAutentificare(ModAutentificare modAutentificare) {
        this.modAutentificare = modAutentificare;
    }

    public void autentificaClient(){
        modAutentificare.autentifica(nume);
    }
}
