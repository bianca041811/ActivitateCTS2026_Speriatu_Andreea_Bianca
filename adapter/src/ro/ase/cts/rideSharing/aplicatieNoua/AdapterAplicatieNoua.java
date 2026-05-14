package ro.ase.cts.rideSharing.aplicatieNoua;

import ro.ase.cts.rideSharing.aplicatieVeche.AplicatieVeche;

public class AdapterAplicatieNoua extends AplicatieVeche {
    private AplicatieNoua aplicatieNoua;

    public AdapterAplicatieNoua(AplicatieNoua aplicatieNoua) {
        this.aplicatieNoua = aplicatieNoua;
    }
    public void calculCostVechi()
    {
        aplicatieNoua.calculCostAI();
    }

}
