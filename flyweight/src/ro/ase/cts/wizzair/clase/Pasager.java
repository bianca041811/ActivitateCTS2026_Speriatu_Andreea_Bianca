package ro.ase.cts.wizzair.clase;

public class Pasager implements PasagerAbstract {
    private String nume;
    private int nrPasaport;
    private String telefon;
    private String mail;

    public Pasager(String nume, int nrPasaport, String telefon, String mail) {
        this.nume = nume;
        this.nrPasaport = nrPasaport;
        this.telefon = telefon;
        this.mail = mail;
    }


    @Override
    public void afiseazaZbor(Zbor zbor) {
        System.out.println("Pasagerul "+nume+" cu nr de pasaport "+nrPasaport+" are nr de telefon "+telefon+" si adresa de mail: "+mail);
        System.out.println(zbor.toString());
    }

    @Override
    public void afiseazaDetaliiZbor(Zbor zbor) {
        System.out.println("Pasagerul "+nume+" va calatori in zborul nu nr-ul "+zbor.getNrZbor());
    }
}
