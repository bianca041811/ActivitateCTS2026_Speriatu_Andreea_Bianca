package ro.ase.cts.factorymethod.clase;

public class AbonamentTVPremium extends AbonamentTV{
    public AbonamentTVPremium(String numeClient, Integer pret) {
        super(numeClient, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Abonamentul clientului "+numeClient+" costa "+pret+" lei");

    }
}
