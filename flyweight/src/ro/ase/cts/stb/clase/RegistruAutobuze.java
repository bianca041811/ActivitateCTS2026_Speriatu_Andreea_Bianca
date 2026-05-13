package ro.ase.cts.stb.clase;



import java.util.HashMap;
import java.util.Map;

public class RegistruAutobuze {
    private Map<String, AutobuzAbstract> autobuze= new HashMap<>();

    public AutobuzAbstract getAutobuz(String model , int anFabricatie, int nrLocuri)
    {
        AutobuzAbstract autobuz= autobuze.get(model);
        if(autobuz == null)
        {
            autobuz= new Autobuz(model, anFabricatie, nrLocuri);
            autobuze.put(model, autobuz);
        }
        return autobuz;
    }
}
