package ro.ase.cts.bibloteca.clase;

public class Imprumut {
    private int nrRaft;
    private String data;
    private int nrZile;

    public Imprumut(int nrRaft, String data, int nrZile) {
        this.nrRaft = nrRaft;
        this.data = data;
        this.nrZile = nrZile;
    }

    public int getNrRaft() {
        return nrRaft;
    }

    public String getData() {
        return data;
    }

    public int getNrZile() {
        return nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imprumut{");
        sb.append("nrRaft=").append(nrRaft);
        sb.append(", data='").append(data).append('\'');
        sb.append(", nrZile=").append(nrZile);
        sb.append('}');
        return sb.toString();
    }
}
