package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.AbonamentStandard;

public class Main {
    public static void main(String[] args) {
        AbonamentStandard abonamentStandard=new AbonamentStandard("Pachet Standard", 35, 2, false);
        AbonamentStandard abonament1=(AbonamentStandard)abonamentStandard.copiaza();
        abonament1.setNrUtilizatoriSimultan(3);
        System.out.println(abonament1.toString());


    }
}
