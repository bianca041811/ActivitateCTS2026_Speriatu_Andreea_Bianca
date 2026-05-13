package ro.ase.cts.stb.clase;

public class Autobuz implements Structura{
    private String model;
    private int numarLocuri;

    public Autobuz(String model, int numarLocuri) {
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + "Autobuzul "+model+" are "+numarLocuri+" locuri");
    }
}
