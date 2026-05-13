package ro.ase.cts.stb.clase;

public class PlataCardBancar implements ModalitatePlata{
    @Override
    public void plateste(String numeCalator, float suma) {
        System.out.println("Calatorul "+numeCalator+" a platit cu cardul bancar "+suma+" lei");
    }
}
