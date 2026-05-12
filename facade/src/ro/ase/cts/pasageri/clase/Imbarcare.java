package ro.ase.cts.pasageri.clase;

public class Imbarcare {
    private String numePasager;

    public Imbarcare(String numePasager) {
        this.numePasager = numePasager;
    }

    public String getNumePasager() {
        return numePasager;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imbarcare{");
        sb.append("numePasager='").append(numePasager).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
