package ro.ase.cts.fitness.clase;

public class Antrenament implements IAntrenament {
    private String data;
    private String ora;

    public Antrenament(String data, String ora) {
        this.data = data;
        this.ora = ora;
    }

    @Override
    public void afiseaza() {
        System.out.println("antrenamentul va avea loc in data "+data+" la ora "+ora);
    }
}
