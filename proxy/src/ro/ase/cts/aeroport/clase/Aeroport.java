package ro.ase.cts.aeroport.clase;


public class Aeroport implements IAeroport {
    private String numeAeroport;

    public Aeroport(String numeAeroport) {
        this.numeAeroport = numeAeroport;
    }

    @Override
    public void permiteAccesVip(Pasager pasager) {
        System.out.println("pasagerul"+pasager.getNumePasager()+" are acces pe aeroportul: "+numeAeroport);
    }
}
