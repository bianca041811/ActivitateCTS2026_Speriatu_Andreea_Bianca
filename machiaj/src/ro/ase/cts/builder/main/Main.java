package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Programare;
import ro.ase.cts.builder.clase.ProgramareBuilder;

public class Main {
    public static void main(String[] args) {
        Programare programare1 = new ProgramareBuilder("Ana")
                .setMachiajproba(true)
                .setFondDeTenPremium(true)
                .setAvans(true)
                .build();

        Programare programare2 = new ProgramareBuilder("Maria")
                .setAvans(true)
                .build();

        Programare programare3 = new ProgramareBuilder("Elena")
                .setMachiajproba(true)
                .setFondDeTenPremium(false)
                .setAvans(false)
                .build();

        System.out.println(programare1.toString());
        System.out.println(programare2.toString());
        System.out.println(programare3.toString());
    }
}
