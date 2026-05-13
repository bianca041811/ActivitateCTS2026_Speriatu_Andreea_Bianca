package ro.ase.cts.bibloteca.clase;

public class Cititor implements CititorAbstract{
    private String nume;
    private String mail;
    private String telefon;
    private String domiciliu;

    public Cititor(String nume, String mail, String telefon, String domiciliu) {
        this.nume = nume;
        this.mail = mail;
        this.telefon = telefon;
        this.domiciliu = domiciliu;
    }

    @Override
    public void afiseazaImprumut(Imprumut imprumut) {
        System.out.println("Cititorul "+nume+" are mailul: "+mail+" ,nr de telefon:"+telefon+" locuieste in "+domiciliu);
        System.out.println(imprumut.toString());
    }

    @Override
    public void afiseazaDetaliiImprumut(Imprumut imprumut) {
        System.out.println("Cititorul a imprumutat o carte in "+imprumut.getData());
    }
}
