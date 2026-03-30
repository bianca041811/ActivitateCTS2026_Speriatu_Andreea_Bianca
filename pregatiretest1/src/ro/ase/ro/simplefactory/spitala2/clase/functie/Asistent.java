package ro.ase.ro.simplefactory.spitala2.clase.functie;

public class Asistent implements Functie {
    private Integer salariul;
    private String nume;

    public Asistent(Integer salariul, String nume) {
        this.salariul = salariul;
        this.nume = nume;
    }


    @Override
    public void afiseazaTipFunctie() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistentul ").append(this.nume).append(" are salariul ").append(this.salariul);
        System.out.println(sb.toString());
    }
}
