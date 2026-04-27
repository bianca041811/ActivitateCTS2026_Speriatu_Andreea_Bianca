package ro.ase.cts.simplefactory.clase;

public class Blush implements Machiaj{
    private String marca;
    private String nuanta;
    private Integer gramaj;
    private Integer pret;

    public Blush(String marca, String nuanta, Integer gramaj, Integer pret) {
        this.marca = marca;
        this.nuanta = nuanta;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public void afiseazaTipMachiaj() {
        StringBuilder sb = new StringBuilder();
        sb.append("Blush-ul").append(this.marca).append(" are nuanta ").append(this.nuanta)
                .append(" , cantareste").append(this.gramaj).append(" grame, si costa").append(this.pret);
        System.out.println(sb.toString());
    }
}
