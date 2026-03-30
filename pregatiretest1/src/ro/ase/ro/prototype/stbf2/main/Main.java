package ro.ase.ro.prototype.stbf2.main;

import ro.ase.ro.prototype.stbf2.clase.Autobuz;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("MERCEDES", 42, 178);
        Autobuz autobuz2 = (Autobuz) autobuz.copiaza();
        autobuz2.setNrLinie(162);
        System.out.println(autobuz2.toString());
    }
}
