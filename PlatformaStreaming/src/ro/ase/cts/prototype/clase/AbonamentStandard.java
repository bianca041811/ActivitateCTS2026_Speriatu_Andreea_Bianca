package ro.ase.cts.prototype.clase;

public class AbonamentStandard implements IAbonamentStandard {
    private String denumire;
    private Integer pret;
    private Integer nrUtilizatoriSimultan;
    private boolean extraBeneficii;

    private AbonamentStandard() {}


    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public void setNrUtilizatoriSimultan(Integer nrUtilizatoriSimultan) {
        this.nrUtilizatoriSimultan = nrUtilizatoriSimultan;
    }

    public void setExtraBeneficii(boolean extraBeneficii) {
        this.extraBeneficii = extraBeneficii;
    }

    public AbonamentStandard(String denumire, Integer pret, Integer nrUtilizatoriSimultan, boolean extraBeneficii) {
        if (denumire != null) {
            this.denumire = denumire;
        } else {
            this.denumire = "";
        }
        if (pret >= 20 && pret <= 80) {
            this.pret = pret;
        } else {
            this.pret = 0;
        }
        if (nrUtilizatoriSimultan >= 0 && nrUtilizatoriSimultan <= 3) {
            this.nrUtilizatoriSimultan = nrUtilizatoriSimultan;
        } else {
            this.nrUtilizatoriSimultan = 0;
        }
        this.extraBeneficii = extraBeneficii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbonamentStandard{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrUtilizatoriSimultan=").append(nrUtilizatoriSimultan);
        sb.append(", extraBeneficii=").append(extraBeneficii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IAbonamentStandard copiaza() {
       AbonamentStandard abonamentStandard= new AbonamentStandard();
       abonamentStandard.denumire=this.denumire;
       abonamentStandard.pret=this.pret;
       abonamentStandard.nrUtilizatoriSimultan=this.nrUtilizatoriSimultan;
       abonamentStandard.extraBeneficii=this.extraBeneficii;
       return abonamentStandard;
    }

}
