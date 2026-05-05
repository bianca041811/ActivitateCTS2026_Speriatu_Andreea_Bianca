package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu");
        Pacient pacient2 = new Pacient("Grigorescu");

        PersonalSpital medic = new Medic("Ionescu");
        PersonalSpital asistenta = new Asistenta("Dramnescu");
        Command comanda1 = new Internare(medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);
        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.executaFisa();
        operator.inregistreaza(new Tratare(asistenta, new Pacient("Eminescu")));
        operator.executaFisa();
        operator.executaFisa();
    }
}
