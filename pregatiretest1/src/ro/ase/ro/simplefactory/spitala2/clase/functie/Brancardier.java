package ro.ase.ro.simplefactory.spitala2.clase.functie;

public class Brancardier implements Functie{
    private Integer salariul;
    private String nume;

    public Brancardier(Integer salariul,String nume) {
        this.nume = nume;
        this.salariul = salariul;
    }


    @Override
    public void afiseazaTipFunctie() {
       StringBuilder sb =new StringBuilder();
       sb.append("Brancardierul").append(this.nume).append("are salariul ").append(this.salariul);
       System.out.println(sb.toString());
    }
}
