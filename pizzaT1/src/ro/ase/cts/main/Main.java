package ro.ase.cts.main;

import ro.ase.cts.clase.*;
import ro.ase.cts.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        IPizza pizza1 = factory.getPizza(TipPizza.MARGHERITA, "Margherita Clasica", 30, 32, false);
        IPizza pizza2 = factory.getPizza(TipPizza.PEPPERONI, "Pepperoni Special", 40, 37, true);
        IPizza pizza3 = factory.getPizza(TipPizza.MARGHERITA, "Margherita Mare", 40, 35, true);
        IPizza pizza4 = factory.getPizza(TipPizza.DIAVOLA, "Diavola", 30, 40, false);

        System.out.println(pizza1.getDetalii());
        pizza1.prepara();
        System.out.println("Pret: " + pizza1.getPret());
        System.out.println();

        System.out.println(pizza2.getDetalii());
        pizza2.prepara();
        System.out.println("Pret: " + pizza2.getPret());
        System.out.println();

        System.out.println(pizza3.getDetalii());
        pizza3.prepara();
        System.out.println("Pret: " + pizza3.getPret());
        System.out.println();

        System.out.println(pizza4.getDetalii());
        pizza4.prepara();
        System.out.println("Pret: " + pizza4.getPret());
        System.out.println();

    }
}
