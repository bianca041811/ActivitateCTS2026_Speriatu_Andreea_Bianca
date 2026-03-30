package ro.ase.ro.builder.stbf3.main;

import ro.ase.ro.builder.stbf3.clase.Autobuz;
import ro.ase.ro.builder.stbf3.clase.AutobuzBuilder;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(true, false, true,true,"Mercedes");
        Autobuz autobuz2 = new Autobuz(false, false, false,false,"Audi");

        AutobuzBuilder builder = new AutobuzBuilder(("BMW"));
        Autobuz autobuz3 = builder.build();
        Autobuz autobuz4 = builder.setNumeAutobuz("aaaaa").setAerConditionat(true).setWifi(true).setUsiAutomate(true).setSistemAudio(true).build();
        System.out.println(autobuz3.toString());
        System.out.println(autobuz4.toString());




    }
}
