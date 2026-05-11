package ro.ase.cts.stb.main;

import ro.ase.cts.stb.facade.StbFacade;

public class Main {
    public static void main(String[] args) {
        StbFacade facade = new StbFacade();

        facade.puneToateUsileInModulLiber();
        facade.deschideFortatToateUsile();
    }
}
