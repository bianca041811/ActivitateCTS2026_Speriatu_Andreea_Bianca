package ro.ase.ro.builder.restaurantb2.clase;

public class RezervareBuilderAlternativ implements RezervareBuilderAbstractA {
    protected boolean masaLaGeam;
    protected boolean scauneErgonomice;
    protected boolean muzica;
    protected boolean decor;


    @Override
    public Rezervare build(String nume) {
       Rezervare rezervare = new Rezervare(this.masaLaGeam,this.scauneErgonomice,this.muzica,this.decor,nume);
       return rezervare;
    }

    public RezervareBuilderAlternativ( String PopescuMihai) {
        this.masaLaGeam = false;
        this.scauneErgonomice = false;
        this.muzica = false;
        this.decor = false;
    }

    public RezervareBuilderAlternativ setMasaLaGeam(boolean masaLaGeam) {
        this.masaLaGeam = masaLaGeam;
        return this;
    }

    public RezervareBuilderAlternativ setMuzica(boolean muzica) {
        this.muzica = muzica;
        return this;

    }

    public RezervareBuilderAlternativ setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;

    }

    public RezervareBuilderAlternativ setDecor(boolean decor) {
        this.decor = decor;
        return this;

    }
}
