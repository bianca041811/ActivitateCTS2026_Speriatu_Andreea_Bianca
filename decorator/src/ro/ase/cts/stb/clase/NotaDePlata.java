package ro.ase.cts.stb.clase;

import ro.ase.cts.stb.clase.NotaDePlataAbstract;

public class NotaDePlata implements NotaDePlataAbstract {
    private float suma;
    private String data;

    public NotaDePlata(float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("Nota de plata a costat : "+suma+" lei, sia  fost achitata in data de "+data);
    }
}
