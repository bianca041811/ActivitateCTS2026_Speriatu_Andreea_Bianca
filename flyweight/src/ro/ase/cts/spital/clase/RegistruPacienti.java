package ro.ase.cts.spital.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {
    private Map<String, PacientAbstract>pacienti= new HashMap<>();

    public PacientAbstract getPacient(String nume, String telefon, String adresa)
    {
        PacientAbstract pacient =pacienti.get(telefon);
        if(pacient==null)
        {
            pacient= new Pacient(nume, telefon, adresa);
            pacienti.put(telefon, pacient);
        }
        return pacient;
    }
}
