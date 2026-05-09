package ro.ase.cts.restaurant.aplicatie_bar;

import ro.ase.cts.restaurant.aplicatie_bucatarie.FacturaBucatarie;

public class AdaptorFacturaBucatarie extends SoftNouBar{
    FacturaBucatarie facturaBucatarie;

    public AdaptorFacturaBucatarie(FacturaBucatarie facturaBucatarie) {
        this.facturaBucatarie = facturaBucatarie;
    }
    @Override
    public void genereazaBonBar()
    {
        facturaBucatarie.printeazaFactura();
    }
}
