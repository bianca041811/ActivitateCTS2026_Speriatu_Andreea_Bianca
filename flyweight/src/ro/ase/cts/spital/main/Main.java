package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.Internare;
import ro.ase.cts.spital.clase.PacientAbstract;
import ro.ase.cts.spital.clase.RegistruPacienti;

public class Main {
    public static void main(String[] args) {
        RegistruPacienti registru = new RegistruPacienti();
        PacientAbstract pacient1 = registru.getPacient("Ana", "0763257429","Ploiesti");
        Internare internare= new Internare(23,2,3);
        Internare internare1 = new Internare(4, 3,5);

        pacient1.afiseazaInternare(internare);
        pacient1.afiseazaDetaliiSalon(internare);

        pacient1.afiseazaInternare(internare1);
        pacient1.afiseazaDetaliiSalon(internare1);

        registru.getPacient("Ana", "0763257429","Ploiesti").afiseazaDetaliiSalon(internare1);
        registru.getPacient("Mihai","073443443","Sibiu").afiseazaInternare(new Internare(1,1,2));
    }
}
