package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Abonament;
import ro.ase.cts.builder.clase.AbonamentBuilder;

public class Main {
    public static void main(String[] args) {

        Abonament abonament = new Abonament(true, true, false, "Standard");
        Abonament abonament2 = new Abonament(false, false, false, "Basic");
        AbonamentBuilder abonamentBuilder = new AbonamentBuilder(("Premium"));
        Abonament abonament3 = abonamentBuilder.build();
        Abonament abonament4 = abonamentBuilder.setNume("Family").setIngheataZi(true)
                .setRezolutieMare(true).setEcranSuplimentar(false).build();
        System.out.println(abonament.toString());
        System.out.println(abonament2.toString());
        System.out.println(abonament3.toString());
        System.out.println(abonament4.toString());
    }
}
