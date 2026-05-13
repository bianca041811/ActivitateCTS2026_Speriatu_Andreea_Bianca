package ro.ase.cts.wizzair.clase;

public class Zbor {
    private int nrZbor;
    private int poartaImbarcare;
    private int loc;

    public Zbor(int nrZbor, int poartaImbarcare, int loc) {
        this.nrZbor = nrZbor;
        this.poartaImbarcare = poartaImbarcare;
        this.loc = loc;
    }

    public int getNrZbor() {
        return nrZbor;
    }

    public int getPoartaImbarcare() {
        return poartaImbarcare;
    }

    public int getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("nrZbor=").append(nrZbor);
        sb.append(", poartaImbarcare=").append(poartaImbarcare);
        sb.append(", loc=").append(loc);
        sb.append('}');
        return sb.toString();
    }
}
