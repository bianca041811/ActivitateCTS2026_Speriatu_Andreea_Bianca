package ro.ase.ro.builder.restaurantb2.clase;

public class RezervareBuilder implements RezervareBuilderAbstract{
    private Rezervare rezervare;
    public RezervareBuilder(String nume){
        this.rezervare=new Rezervare(false,false,false,false,nume);
    }

    public RezervareBuilder setMasaLaGeam(boolean areMasaLaGeam)
    {
        rezervare.masaLaGeam=areMasaLaGeam;
        return this;
    }
    public RezervareBuilder setScauneErgonomice(boolean areScauneErgonomice) {
        rezervare.scauneErgonomice = areScauneErgonomice;
        return this;
    }

    public RezervareBuilder setMuzica(boolean areMuzica) {
        rezervare.muzica = areMuzica;
        return this;
    }

    public RezervareBuilder setDecor(boolean areDecor) {
        rezervare.decor = areDecor;
        return this;
    }

    public RezervareBuilder setNumeClient(String nume) {
        rezervare.numeClient = nume;
        return this;
    }


    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
