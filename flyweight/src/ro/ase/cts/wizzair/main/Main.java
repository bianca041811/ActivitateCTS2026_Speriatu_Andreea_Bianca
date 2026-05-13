package ro.ase.cts.wizzair.main;

import ro.ase.cts.wizzair.clase.Pasager;
import ro.ase.cts.wizzair.clase.PasagerAbstract;
import ro.ase.cts.wizzair.clase.RegistruPasageri;
import ro.ase.cts.wizzair.clase.Zbor;

public class Main {
    public static void main(String[] args) {
        RegistruPasageri regristru= new RegistruPasageri();
        PasagerAbstract pasager1= new Pasager("Ion",123,"0756432832","ion@gmail.com");

        Zbor zbor1 =new Zbor(1,2,3);
        Zbor zbor2 = new Zbor(2,4,6);

        pasager1.afiseazaZbor(zbor1);
        pasager1.afiseazaDetaliiZbor(zbor1);
        pasager1.afiseazaZbor(zbor2);

        regristru.getPasager("Ion",123,"0756432832","ion@gmail.com").afiseazaDetaliiZbor(zbor2);
        regristru.getPasager("Mirela",432,"90686375832","mirela@gmail.com").afiseazaZbor(zbor1);


    }
}
