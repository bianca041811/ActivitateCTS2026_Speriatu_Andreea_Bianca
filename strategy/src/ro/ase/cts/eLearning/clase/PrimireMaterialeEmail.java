package ro.ase.cts.eLearning.clase;

public class PrimireMaterialeEmail implements ModPrimireMateriale{
    @Override
    public void primesteMateriale(String nume) {
        System.out.println("Studentul "+nume+"a primit materialele de studiu pe mail");
    }
}
