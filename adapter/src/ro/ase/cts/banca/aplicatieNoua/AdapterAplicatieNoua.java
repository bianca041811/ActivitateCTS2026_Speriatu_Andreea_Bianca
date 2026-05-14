package ro.ase.cts.banca.aplicatieNoua;

import ro.ase.cts.banca.aplicatieVeche.AplicatieVeche;

public class AdapterAplicatieNoua extends AplicatieVeche {
    private AplicatieNoua aplicatieNoua;

    public AdapterAplicatieNoua(AplicatieNoua aplicatieNoua) {
        this.aplicatieNoua = aplicatieNoua;
    }

    public AplicatieNoua getAplicatieNoua() {
        return aplicatieNoua;
    }

    public void verificaIndetitateCNP()
    {
        aplicatieNoua.verificaIndentitateBiometric();
    }
}
