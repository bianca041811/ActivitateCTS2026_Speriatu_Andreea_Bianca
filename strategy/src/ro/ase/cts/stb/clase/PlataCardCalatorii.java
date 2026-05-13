package ro.ase.cts.stb.clase;

public class PlataCardCalatorii implements ModalitatePlata{

    @Override
    public void plateste(String numeCalator, float suma) {
        System.out.println("Calatorul "+numeCalator+" a platit cu cardul de calatorii "+suma+" lei");

    }
}
