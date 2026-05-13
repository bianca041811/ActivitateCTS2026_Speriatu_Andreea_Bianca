package ro.ase.cts.wizzair.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPasageri {
    private Map<String , PasagerAbstract> pasageri=new HashMap<>();

    public PasagerAbstract getPasager(String nume, int nrPasaport,String telefon, String mail)
    {
        PasagerAbstract pasager= pasageri.get(nume);
        if(pasager==null)
        {
            pasager = new Pasager(nume, nrPasaport,telefon,mail);
            pasageri.put(nume,pasager);
        }
        return pasager;
    }

}
