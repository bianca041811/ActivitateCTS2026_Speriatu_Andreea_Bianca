package ro.ase.cts.main;

import ro.ase.cts.builder.Internare;
import ro.ase.cts.builder.InternareBuilder;
import ro.ase.cts.builder.InternareBuilderAlternativ;

//psvm si apare a 4-a linie
public class Main {
    public static void main(String[] args) {
        Internare internare= new Internare(true, false,true,true, "Mihai Popescu");
        Internare internare2 = new Internare(false, false,false,false, "Ana Ionescu");

        InternareBuilder builder =  new InternareBuilder(("Ana Pop"));
        Internare internare3=builder.build();
        Internare internare4=builder.setNume("Mihai Popescu").setPat(true).setPapuci(true).setHalat(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ("Mihai Popescu");
        builderAlternativ.setMicDejun(true);
        Internare internare101=builderAlternativ.build("ionescu");
        Internare internare102=builderAlternativ.build("Georgescu Mara");
        Internare internare103=builderAlternativ.build("Carina Popa");

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());






    }
}
