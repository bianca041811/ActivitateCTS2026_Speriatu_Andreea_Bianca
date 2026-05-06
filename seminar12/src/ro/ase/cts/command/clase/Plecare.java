package ro.ase.cts.command.clase;

import ro.ase.cts.command.clase.Autobuz;

public class Plecare implements  Command{
    private Autobuz autobuz;
    private int nrLinie;
    @Override
    public void pleacaInCursa() {
        autobuz.pleacaPeTraseu(nrLinie);
    }

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }
}
