package ro.ase.ro.simplefactory.restaurantb1.clase.supa;

public class SupaLegume implements Supa{
    private Integer pret;
    private String culoare;

    public SupaLegume(Integer pret, String culoare) {
        this.pret = pret;
        this.culoare = culoare;
    }

    @Override
    public void afiseazaTipSupa() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de legume costa ").append(this.pret).append(" lei si are culoarea ").append(this.culoare);
        System.out.println(sb.toString());
    }
}
