package ro.ase.cts.flyweight.clase;

import ro.ase.cts.flyweight.clase.Client;

import java.util.HashMap;
import java.util.Map;

public class RegistrulClienti {
    private Map<String, ClientAbstract> clienti=new HashMap<>();

    public ClientAbstract getClient(String nume, String telefon,String mail)
    {
        ClientAbstract client=clienti.get(telefon);
        if(client==null)
        {
            client=new Client(nume, telefon, mail);
            clienti.put(telefon,client);
        }
        return client;
    }
}
