package ro.ase.cts.eLearning.clase;

public class PrimireMaterialeAplicatie implements ModPrimireMateriale{

    @Override
    public void primesteMateriale(String nume) {
        System.out.println("Studentul "+nume+"a primit materialele de studiu in aplicatie");

    }
}
