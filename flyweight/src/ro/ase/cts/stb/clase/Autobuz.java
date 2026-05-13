package ro.ase.cts.stb.clase;

public class Autobuz implements AutobuzAbstract{
    private String model;
    private int anFabricatie;
    private int nrLocuiri;

    public Autobuz(String model, int anFabricatie, int nrLocuiri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuiri = nrLocuiri;
    }

    @Override
    public void afiseazaLinie(Linie linie) {
        System.out.println("Autobuzul: "+model+" este fabicat in anul: "+anFabricatie+" si are "+nrLocuiri+" locuri");
        System.out.println(linie.toString());
    }

    @Override
    public void afiseazaDetalii(Linie linie) {
        System.out.println("Autobuzul: "+model+" circula pe linia "+linie.getNrLinie());
    }
}
