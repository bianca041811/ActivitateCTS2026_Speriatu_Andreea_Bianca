package ro.ase.cts.proxy.proxy;

import ro.ase.cts.proxy.clase.ISpital;
import ro.ase.cts.proxy.clase.Pacient;

public class ProxyCuAsigurare implements ISpital {
    private ISpital spital;

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        } else{
            System.out.println("Pacientul nu are asigurare");
        }
    }

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }
}
