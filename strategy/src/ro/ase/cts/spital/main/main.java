package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.Pacient;
import ro.ase.cts.spital.clase.PlataCash;

public class main {
    public static void main(String[] args) {
        Pacient pacient= new Pacient("Simona");

        pacient.platesteTranzactie(230.00f);
        pacient.setMetodaDePlata(new PlataCash());
        pacient.platesteTranzactie(210.00f);

    }
}
