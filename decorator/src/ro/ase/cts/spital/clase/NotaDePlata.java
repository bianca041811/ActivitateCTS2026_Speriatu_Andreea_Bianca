package ro.ase.cts.spital.clase;

public class NotaDePlata implements NotaDePlataAbstract {
    private float suma;
    private String data;

    public NotaDePlata(float suma, String data) {
        this.suma = suma;
        this.data = data;
    }


    @Override
    public void printeaza() {
        System.out.println("Nota de plata este in valoare de "+suma+" lei si a fost realizata la data de "+data);
    }
}
