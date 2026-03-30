package ro.ase.ro.prototype.stbf2.clase;

public class Autobuz implements IAutobuz{
    private String marca;
    private Integer nrLocuri;
    private Integer nrLinie;

    private Autobuz(){}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", nrLinie=").append(nrLinie);
        sb.append('}');
        return sb.toString();
    }

    public Autobuz(String marca, Integer nrLocuri, Integer nrLinie) {
        this.marca = marca;
        this.nrLocuri = nrLocuri;
        this.nrLinie = nrLinie;
    }


    @Override
    public IAutobuz copiaza() {
        Autobuz autobuz = new Autobuz();
        autobuz.marca=this.marca;
        autobuz.nrLocuri=this.nrLocuri;
        autobuz.nrLinie=this.nrLinie;
        return autobuz;
    }
}
