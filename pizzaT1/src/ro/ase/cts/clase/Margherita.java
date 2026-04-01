package ro.ase.cts.clase;

public class Margherita implements IPizza{
    private String nume;
    private Integer gramaj;
    private Integer pret;
    private boolean extra;

    public Margherita(String nume, Integer gramaj, Integer pret, boolean extra) {
        this.nume = nume;
        this.gramaj = gramaj;
        this.pret = pret;
        this.extra = extra;
    }

    @Override
    public void prepara() {
        System.out.println("Se prepara blatul");
        System.out.println("Se adauga toppingurile asociate retetei");
        System.out.println("Se coace ");
        System.out.println("Se cantareste");
        System.out.println("pizza"+nume+" are "+gramaj+" grame si are pretul "+pret);


    }

    @Override
    public String getDetalii() {
        return "Pizza " + nume + " are " + gramaj + " grame, pretul " + pret + " si extra=" + extra;

    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public boolean areExtra() {
        return extra;
    }
}
