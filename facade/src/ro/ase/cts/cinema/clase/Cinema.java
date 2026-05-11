package ro.ase.cts.cinema.clase;

public class Cinema {
    private String nume;

    public Cinema(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cinema{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
