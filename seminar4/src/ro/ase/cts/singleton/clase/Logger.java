package ro.ase.cts.singleton.clase;

public class Logger {
    protected  int cod;
    protected String sender;
    protected String categorie;
    private static Logger instantaSingleton=null;
//- din diagrama inseamna private =>constructor private;+ public
    private Logger( String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }



    //cand avem asa multe concatenari este recomandata sa folosim stream Builder
    public void afiseazaLog(String text){
        System.out.println("Log cu id"+ cod + ", efectuat de utilizatorul"+sender+ "a constat in"+ text +"din categoria"+categorie);
        this.cod++;

    }
    //lazy initialization
    public static synchronized Logger getInstanta(String sender,String  categorie){
        if(instantaSingleton == null){
            instantaSingleton= new Logger(sender , categorie);

        }
        return instantaSingleton;
    }
}
