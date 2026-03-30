package ro.ase.ro.simplefactory.restaurantb1.clase.supa;

public class SupaCiuperci implements Supa{
    private Integer pret;
    private String culoare;

    public SupaCiuperci(Integer pret, String culoare) {
        this.pret = pret;
        this.culoare = culoare;
    }

    @Override
    public void afiseazaTipSupa() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de ciuperci costa ").append(this.pret).append(" lei si are culoarea ").append(this.culoare);
        System.out.println(sb.toString());

    }
}
