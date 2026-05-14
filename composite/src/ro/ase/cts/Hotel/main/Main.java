package ro.ase.cts.Hotel.main;

import ro.ase.cts.Hotel.clase.Camera;
import ro.ase.cts.Hotel.clase.Etaj;

public class Main {
    public static void main(String[] args) {
        Etaj hotel = new Etaj(0);

        Etaj etaj1 = new Etaj(1);
        Etaj etaj2 = new Etaj(2);
        Etaj zonaVIP = new Etaj(100);

        Camera camera101 = new Camera(101, 2);
        Camera camera102 = new Camera(102, 1);
        Camera camera201 = new Camera(201, 3);
        Camera cameraVIP = new Camera(999, 2);

        etaj1.adaugaCamera(camera101);
        etaj1.adaugaCamera(camera102);

        etaj2.adaugaCamera(camera201);

        zonaVIP.adaugaCamera(cameraVIP);
        etaj2.adaugaSubsectiune(zonaVIP);

        hotel.adaugaSubsectiune(etaj1);
        hotel.adaugaSubsectiune(etaj2);

        hotel.afiseazaHotel("");
    }
}
