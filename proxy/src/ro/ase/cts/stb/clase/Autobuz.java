package ro.ase.cts.stb.clase;

public class Autobuz implements IAutobuz {
    private String numeAutobuz;

    public Autobuz(String numeAutobuz) {
        this.numeAutobuz = numeAutobuz;
    }

    @Override
    public void opreste(Statie statie) {
        System.out.println("Autobuzul "+this.numeAutobuz+" opreste in statia "+statie.getNume()+" care are "+statie.getNrPersoane()+" persoane");
    }
}
