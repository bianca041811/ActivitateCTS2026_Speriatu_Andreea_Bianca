package ro.ase.ro.simplefactory.restaurantb1.clase.supa;

public class SupaVita implements Supa{
    private Integer pret;
    private String culoare;

    public SupaVita(Integer pret, String culoare) {
        this.pret = pret;
        this.culoare = culoare;
    }

    @Override
    public void afiseazaTipSupa() {
        StringBuilder sb= new StringBuilder();
        sb.append("Supa de vita costa").append(this.pret).append(" lei s are culoarea ").append(this.culoare);
        System.out.println(sb.toString());
    }
}
