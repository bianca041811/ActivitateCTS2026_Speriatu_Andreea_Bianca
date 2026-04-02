package ro.ase.cts.factorymethod.clase;

public class AbonamentNetbasic extends AbonamentInternet{
    public AbonamentNetbasic(String numeClient, Integer pret, Integer mbps) {
        super(numeClient, pret, mbps);
    }

    @Override
    public void afiseaza() {
        System.out.println("Abonamentul clientului "+numeClient+" costa "+pret+" lei si are o viteza de "+mbps+"mbps.");

    }
}
