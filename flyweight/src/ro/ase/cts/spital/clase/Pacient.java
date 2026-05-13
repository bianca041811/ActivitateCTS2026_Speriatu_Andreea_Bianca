package ro.ase.cts.spital.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInternare(Internare internare) {
        System.out.println("Pacientul "+nume+" ,telefon: "+telefon+" ,adresa:"+adresa);
        System.out.println(internare.toString());
    }

    @Override
    public void afiseazaDetaliiSalon(Internare internare) {
        System.out.println("Pacientul: "+nume+" este internat in salonul "+internare.getNrSalon()+" , patul "+internare.getNrPat());
    }
}
