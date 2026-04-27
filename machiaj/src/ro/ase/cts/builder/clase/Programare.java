package ro.ase.cts.builder.clase;

public class Programare {
    protected boolean machiajproba;
    protected boolean fondDeTenPremium;
    protected boolean avans;
    protected String numeClienta;

    public Programare(boolean machiajproba, boolean fondDeTenPremium, boolean avans, String numeClienta) {
        this.machiajproba = machiajproba;
        this.fondDeTenPremium = fondDeTenPremium;
        this.avans = avans;
        this.numeClienta = numeClienta;
    }

    protected void setMachiajproba(boolean machiajproba) {
        this.machiajproba = machiajproba;
    }

    protected void setFondDeTenPremium(boolean fondDeTenPremium) {
        this.fondDeTenPremium = fondDeTenPremium;
    }

    protected void setAvans(boolean avans) {
        this.avans = avans;
    }

    protected void setNumeClienta(String numeClienta) {
        this.numeClienta = numeClienta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programare{");
        sb.append("machiajproba=").append(machiajproba);
        sb.append(", fondDeTenPremium=").append(fondDeTenPremium);
        sb.append(", avans=").append(avans);
        sb.append(", numeClienta='").append(numeClienta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
