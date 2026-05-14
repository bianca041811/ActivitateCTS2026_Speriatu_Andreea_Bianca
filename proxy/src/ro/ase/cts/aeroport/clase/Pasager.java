package ro.ase.cts.aeroport.clase;

public class Pasager  {
    private String numePasager;
    private boolean areBiletBusiness;

    public Pasager(String numePasager, boolean areBiletBusiness) {
        this.numePasager = numePasager;
        this.areBiletBusiness = areBiletBusiness;
    }

    public String getNumePasager() {
        return numePasager;
    }

    public boolean isAreBiletBusiness() {
        return areBiletBusiness;
    }


}
