package ro.ase.cts.hotel.facade;

import ro.ase.cts.hotel.clase.Camera;
import ro.ase.cts.hotel.clase.Curatenie;
import ro.ase.cts.hotel.clase.Minibar;
import ro.ase.cts.hotel.clase.Prosoape;

public class CameraFacade {
    private Curatenie curatenie;
    private Minibar minibar;
    private Prosoape prosoape;

    public CameraFacade() {
        this.curatenie = new Curatenie();
        this.minibar = new Minibar();
        this.prosoape = new Prosoape();

    }

    public void pregatesteCamera(Camera camera)
    {
        if(curatenie.eCurata(camera))
        {
            if(minibar.esteAprovizionat(camera))
            {
                if(prosoape.suntCurate(camera))
                {
                    System.out.println("Camera este pregatita");
                }
                else
                {
                    System.out.println("Prosoapele nu au fost schimbate");
                }
            }
            else
            {
                System.out.println("Minibarul nu a fost aprovizionat");
            }
        }
        else {
            System.out.println("Nu a fost facuta curatenia!");
        }
    }
}
