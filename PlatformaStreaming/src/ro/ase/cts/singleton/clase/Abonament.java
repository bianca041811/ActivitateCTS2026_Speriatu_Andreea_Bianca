package ro.ase.cts.singleton.clase;

public class Abonament {
    protected Integer cod;
    protected String nume;
    protected Integer pret;
    protected static Abonament instantaSingleton=null;

    private Abonament(String nume, Integer pret) {
        this.cod = 0;
        this.nume = nume;
        this.pret = pret;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public static Abonament getInstantaSingleton() {
        return instantaSingleton;
    }

    public static void setInstantaSingleton(Abonament instantaSingleton) {
        Abonament.instantaSingleton = instantaSingleton;
    }

   public void afiseazaAbonament(String text){
        System.out.println("Abonamentul cu id-ul "+cod+" se numeste "+nume+" costa "+pret+" lei si consta in:"+text);
        this.cod++;
   }



    public static synchronized Abonament getInstanta(String nume, Integer pret){
        if(instantaSingleton==null)
        {
            instantaSingleton= new Abonament(nume, pret);

        }
        return instantaSingleton;
    }
}
