package ro.ase.cts.cinema.facade;

import ro.ase.cts.cinema.clase.Cinema;
import ro.ase.cts.cinema.clase.VerificareBilet;
import ro.ase.cts.cinema.clase.VerificareOchelari;
import ro.ase.cts.cinema.clase.VerificareVarsta;

public class CinemaFacade {
    private VerificareBilet bilet;
    private VerificareOchelari ochelari;
    private VerificareVarsta varsta;

    public CinemaFacade() {
        this.bilet = new VerificareBilet();
        this.ochelari = new VerificareOchelari();
        this.varsta = new VerificareVarsta();
    }

    public void verificaIntrare(Cinema cinema)
    {
        if(bilet.verificaBilet())
        {
            if(ochelari.verificaOchelari())
            {
                if(varsta.veificaVarsta())
                {
                    System.out.println("Clientul poate intra in sala de cinema "+cinema.getNume());
                }
                else
                {
                    System.out.println("clientul nu are varsa necesara!");
                }

            }
            else
            {
                System.out.println("Clientul nu are ochelari 3D");
            }
        }
        else
        {
            System.out.println("Biletul nu corespunde");
        }
    }
}
