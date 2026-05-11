package ro.ase.cts.restaurant.clase;

public class Masa {
    private int nrMasa;
    private boolean libera;
    private boolean debarasata;
    private boolean serveteleNoi;

    public Masa(int nrMasa, boolean libera, boolean debarasata, boolean serveteleNoi) {
        this.nrMasa = nrMasa;
        this.libera = libera;
        this.debarasata = debarasata;
        this.serveteleNoi = serveteleNoi;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean esteLibera() {
        return libera;
    }

    public boolean esteDebarasata() {
        return debarasata;
    }

    public boolean areServeteleNoi() {
        return serveteleNoi;
    }
}
