package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ISpital;
import ro.ase.cts.observer.clase.Pacient;
import ro.ase.cts.observer.clase.PacientAbonat;
import ro.ase.cts.observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ionescu",32);
        Pacient pacient2 = new PacientAbonat("Popescu",37);

        Pacient pacient3 = new PacientAbonat("Enescu",46);

        ISpital spital=new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notifcaEpidemie();
        ((Spital)spital).notificaVirus();
    }
}
