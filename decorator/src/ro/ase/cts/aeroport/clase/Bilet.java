package ro.ase.cts.aeroport.clase;

public class Bilet implements BiletAbstract{
    private float suma;

    public Bilet(float suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Pasagerul a platit "+ suma+" lei");
    }
}
