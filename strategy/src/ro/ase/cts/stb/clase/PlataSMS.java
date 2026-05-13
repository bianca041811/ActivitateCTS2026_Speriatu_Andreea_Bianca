package ro.ase.cts.stb.clase;

public class PlataSMS implements ModalitatePlata{
    @Override
    public void plateste(String numeCalator, float suma) {
        System.out.println("Calatorul "+numeCalator+" a platit cash "+suma+" lei");

    }
}
