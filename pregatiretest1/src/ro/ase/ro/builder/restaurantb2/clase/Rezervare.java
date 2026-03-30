package ro.ase.ro.builder.restaurantb2.clase;

import java.util.SplittableRandom;

public class Rezervare {
    protected boolean masaLaGeam;
    protected boolean scauneErgonomice;
    protected boolean muzica;
    protected boolean decor;
    protected String numeClient;

    public Rezervare(boolean masaLaGeam, boolean scauneErgonomice, boolean muzica, boolean decor, String numeClient) {
        this.masaLaGeam = masaLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.muzica = muzica;
        this.decor = decor;
        this.numeClient = numeClient;
    }

    protected void setMasaLaGeam(boolean masaLaGeam) {
        this.masaLaGeam = masaLaGeam;
    }

    protected void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    protected void setMuzica(boolean muzica) {
        this.muzica = muzica;
    }

    protected void setDecor(boolean decor) {
        this.decor = decor;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("masaLaGeam=").append(masaLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", muzica=").append(muzica);
        sb.append(", decor=").append(decor);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
//la clasa rezervare facem constructor cu parametri toti , setter protected si to string cu string builder
//apributele sunt toate protected