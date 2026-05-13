package ro.ase.cts.stb.clase;

public class Linie {
    private String nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(String nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public String getNrLinie() {
        return nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie='").append(nrLinie).append('\'');
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
