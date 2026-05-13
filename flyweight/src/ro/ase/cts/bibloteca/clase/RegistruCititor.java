package ro.ase.cts.bibloteca.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruCititor {
    private Map<String,CititorAbstract> cititori= new HashMap<>();

    public CititorAbstract getCititor(String nume, String mail, String telefon, String domiciliu)
    {
        CititorAbstract cititor =cititori.get(nume);
        if(cititor==null)
        {
            cititor = new Cititor(nume, mail, telefon, domiciliu);
            cititori.put(nume, cititor);

        }
        return cititor;
    }
}
