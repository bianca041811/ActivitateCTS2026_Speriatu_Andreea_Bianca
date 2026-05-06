package ro.ase.cts.chain.clase;

public class Autobuz extends Urmatorul {
    @Override
    public String recomandareMijlodDeTransport(double distanta) {
        if(distanta<5)
        {
            return "Autobuz";
        }

        return super.urmatorul.recomandareMijlodDeTransport(distanta);
    }
}
