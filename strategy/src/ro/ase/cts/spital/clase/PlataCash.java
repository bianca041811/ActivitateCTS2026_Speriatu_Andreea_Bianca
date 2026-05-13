package ro.ase.cts.spital.clase;

public class PlataCash implements MetodaDePlataAbstract {
    @Override
    public void plateste(String numePacient, float suma) {
        System.out.println("Pacientul "+numePacient+" a platit cash "+suma+" lei");
    }
}
