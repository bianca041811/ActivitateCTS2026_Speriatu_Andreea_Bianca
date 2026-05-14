package ro.ase.cts.eLearning.clase;

public class Student {
    private String nume;
    private ModPrimireMateriale modPrimireMateriale;

    public Student(String nume) {
        this.nume = nume;
        this.modPrimireMateriale = new PrimireMaterialeAplicatie();
    }

    public void setModPrimireMateriale(ModPrimireMateriale modPrimireMateriale) {
        this.modPrimireMateriale = modPrimireMateriale;
    }


    public void primesteMateriale() {
       modPrimireMateriale.primesteMateriale(nume);
    }
}
