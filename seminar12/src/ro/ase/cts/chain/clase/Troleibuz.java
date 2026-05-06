package ro.ase.cts.chain.clase;

public class Troleibuz extends Urmatorul {

    @Override
    public String recomandareMijlodDeTransport(double distanta) {
        if(distanta<3)
        {
            return "Troleibuz";
        }

        return super.urmatorul.recomandareMijlodDeTransport(distanta);

    }
}
