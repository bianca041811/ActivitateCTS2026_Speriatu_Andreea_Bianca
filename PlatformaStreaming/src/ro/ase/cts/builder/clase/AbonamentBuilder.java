package ro.ase.cts.builder.clase;



public class AbonamentBuilder implements AbonamentBuilderAbstract{
    private Abonament abonament;

    public AbonamentBuilder(String nume) {
        this.abonament=new Abonament(false, false,false,nume);
    }

    public AbonamentBuilder setIngheataZi(boolean areIngheataZi) {
        abonament.ingheataZi = areIngheataZi;
        return this;
    }

    public AbonamentBuilder setRezolutieMare(boolean areRezolutieMare) {
        abonament.rezolutieMare = areRezolutieMare;
        return this;
    }

    public AbonamentBuilder setEcranSuplimentar(boolean areEcranSuplimentar) {
        abonament.ecranSuplimentar = areEcranSuplimentar;
        return this;
    }
    public AbonamentBuilder setNume(String areNume) {
        abonament.nume = areNume;
        return  this;
    }

    @Override
    public Abonament build() {
        return this.abonament;
    }
}
