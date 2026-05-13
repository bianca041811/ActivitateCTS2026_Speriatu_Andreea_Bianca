package ro.ase.cts.universitate.clase;

public class Profesor implements Structura{
    private String nume;
    private String materiePredata;

    public Profesor(String nume, String materiePredata) {
        this.nume = nume;
        this.materiePredata = materiePredata;
    }

    @Override
    public void afiseazaInformatii(String spatii) {
        System.out.println(spatii + "Profesorul: "+nume+" preda materia: "+materiePredata);
    }
}
