package ro.ase.cts.factorymethod.clase;

public class AbonamentTVbasic extends AbonamentTV{
    public AbonamentTVbasic(String numeClient, Integer pret) {
        super(numeClient, pret);
    }

    @Override
    public void afiseaza() {
       System.out.println("Abonamentul clientului "+numeClient+" costa "+pret+" lei");

    }
}
