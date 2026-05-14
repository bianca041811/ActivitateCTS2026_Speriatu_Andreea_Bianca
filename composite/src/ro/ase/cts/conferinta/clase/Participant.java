package ro.ase.cts.conferinta.clase;

import java.util.stream.IntStream;

public class Participant implements Structura {
    private String nume;
    private String echipa;

    public Participant(String nume, String echipa) {
        this.nume = nume;
        this.echipa = echipa;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println("Paticipantul "+nume+" face parte din echipa "+echipa);

    }
}
