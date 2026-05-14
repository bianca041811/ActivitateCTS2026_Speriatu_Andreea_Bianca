package ro.ase.cts.spitalNou.clase;

public class Internare {
    private String cod;

    public Internare(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("cod='").append(cod).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
