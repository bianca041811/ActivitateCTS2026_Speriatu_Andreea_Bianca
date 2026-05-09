package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.aplicatie_bar.AdaptorFacturaBucatarie;
import ro.ase.cts.restaurant.aplicatie_bar.SoftNouBar;
import ro.ase.cts.restaurant.aplicatie_bucatarie.FacturaBucatarie;

public class Main {
    public  static void printareBon(SoftNouBar softNouBar){softNouBar.genereazaBonBar();}

    public static void main(String[] args) {
        FacturaBucatarie factura1=new FacturaBucatarie();
        SoftNouBar factura2=new SoftNouBar();

        factura1.printeazaFactura();
        factura2.genereazaBonBar();
        printareBon(factura2);

        AdaptorFacturaBucatarie facturaAdaptata=new AdaptorFacturaBucatarie(factura1);
        printareBon(facturaAdaptata);
    }
}
