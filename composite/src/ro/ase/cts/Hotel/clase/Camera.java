package ro.ase.cts.Hotel.clase;

import ro.ase.cts.Hotel.clase.Structura;

public class Camera implements Structura {
    private int nrCamera;
    private int nrPaturi;

    public Camera(int nrCamera, int nrPaturi) {
        this.nrCamera = nrCamera;
        this.nrPaturi = nrPaturi;
    }


    @Override
    public void afiseazaHotel(String spatii) {
        System.out.println(spatii+"Camera "+nrCamera+" are "+nrPaturi+" paturi");
    }
}
