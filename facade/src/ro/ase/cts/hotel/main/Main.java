package ro.ase.cts.hotel.main;

import ro.ase.cts.hotel.clase.Camera;
import ro.ase.cts.hotel.facade.CameraFacade;

public class Main {
    public static void main(String[] args) {
        Camera camera= new Camera(12);
        CameraFacade facade= new CameraFacade();

        facade.pregatesteCamera(camera);
    }
}
