package ro.ase.cts.factorymethod.fabrici;

import ro.ase.cts.factorymethod.clase.Abonament;

public interface AbonamentFabrica {
    public Abonament getAbonament(TipAbonament tip, String numeClient, Integer pret);
    public Abonament getAbonament(TipAbonament tip,String numeClient, Integer pret ,Integer mbps);
}
