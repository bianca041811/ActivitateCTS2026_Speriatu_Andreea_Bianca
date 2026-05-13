package ro.ase.cts.spital.clase;

public class PlataCard implements MetodaDePlataAbstract {
    private float sumaDisponibila;
    @Override
    public void plateste(String numePacient, float suma) {
        System.out.println("Pacientul "+numePacient+" a platit cu cardul "+suma+" lei");
        this.sumaDisponibila=this.sumaDisponibila-suma;
    }
}
