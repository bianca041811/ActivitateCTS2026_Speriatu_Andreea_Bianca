package ro.ase.cts.stb.clase;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }

    public void puneModLiber()
    {
        System.out.println("Usa "+pozitie+" este in modul liber");
    }
    public void deschidereFortata()
    {
        System.out.println("Usa "+pozitie+" a fost deschisa fortat");
    }
}
