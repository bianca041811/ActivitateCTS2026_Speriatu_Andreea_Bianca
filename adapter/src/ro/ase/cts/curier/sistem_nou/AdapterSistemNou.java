package ro.ase.cts.curier.sistem_nou;

import ro.ase.cts.curier.sistem_vechi.SistemVechi;

public class AdapterSistemNou extends SistemVechi {
    private SistemNou sistemNou;

    public AdapterSistemNou(SistemNou sistemNou) {
        this.sistemNou = sistemNou;
    }
    public void platesteComanda()
    {
        sistemNou.executaPlata();
    }
}
