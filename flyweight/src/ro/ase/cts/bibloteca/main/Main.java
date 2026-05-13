package ro.ase.cts.bibloteca.main;

import ro.ase.cts.bibloteca.clase.Cititor;
import ro.ase.cts.bibloteca.clase.CititorAbstract;
import ro.ase.cts.bibloteca.clase.Imprumut;
import ro.ase.cts.bibloteca.clase.RegistruCititor;

public class Main {
    public static void main(String[] args) {
        RegistruCititor registru = new RegistruCititor();
        CititorAbstract cititor1= new Cititor("Lucia Simionescu","lucia@gmail.com","0743524764","Iolomita");

        Imprumut imprumut1= new Imprumut(2,"12.03.2020",3);
        Imprumut imprumut2= new Imprumut(3,"31.10.2025",5);

        cititor1.afiseazaImprumut(imprumut1);
        cititor1.afiseazaDetaliiImprumut(imprumut1);
        cititor1.afiseazaDetaliiImprumut(imprumut2);

        registru.getCititor("Lucia Simionescu","lucia@gmail.com","0743524764","Ialomita").afiseazaImprumut(imprumut2);
        registru.getCititor("Maria Popescu","mari@gmail.com","0746257284","Teleorman").afiseazaDetaliiImprumut(imprumut1);

    }
}
