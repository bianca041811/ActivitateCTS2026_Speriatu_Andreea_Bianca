package ro.ase.cts.companie_aeriana.aplicatie_noua;

import ro.ase.cts.companie_aeriana.aplicatie_veche.VerificareVeche;

public class AdaptorVerificareNoua extends VerificareVeche{
    private VerificareNoua verificareNoua;

    public AdaptorVerificareNoua(VerificareNoua verificareNoua) {
        this.verificareNoua = verificareNoua;
    }

    @Override
    public void verificaPasaport()
    {
        verificareNoua.confirmaIdentitatea();
    }
}
