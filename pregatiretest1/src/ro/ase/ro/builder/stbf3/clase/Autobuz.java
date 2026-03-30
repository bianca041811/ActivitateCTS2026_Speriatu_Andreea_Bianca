package ro.ase.ro.builder.stbf3.clase;

public class Autobuz {
    protected boolean aerConditionat;
    protected boolean wifi;
    protected boolean usiAutomate;
    protected boolean sistemAudio;
    protected String numeAutobuz;

    public Autobuz(boolean aerConditionat, boolean usiAutomate, boolean wifi, boolean sistemAudio, String numeAutobuz) {
        this.aerConditionat = aerConditionat;
        this.usiAutomate = usiAutomate;
        this.wifi = wifi;
        this.sistemAudio = sistemAudio;
        this.numeAutobuz = numeAutobuz;
    }

    protected void setAerConditionat(boolean aerConditionat) {
        this.aerConditionat = aerConditionat;
    }

    protected void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    protected void setUsiAutomate(boolean usiAutomate) {
        this.usiAutomate = usiAutomate;
    }

    protected void setSistemAudio(boolean sistemAudio) {
        this.sistemAudio = sistemAudio;
    }

    protected void setNumeAutobuz(String numeAutobuz) {
        this.numeAutobuz = numeAutobuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("aerConditionat=").append(aerConditionat);
        sb.append(", wifi=").append(wifi);
        sb.append(", usiAutomate=").append(usiAutomate);
        sb.append(", sistemAudio=").append(sistemAudio);
        sb.append(", numeAutobuz='").append(numeAutobuz).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
