package ro.ase.cts.pasageri.facade;

import ro.ase.cts.pasageri.clase.Imbarcare;
import ro.ase.cts.pasageri.clase.VerificareBagaj;
import ro.ase.cts.pasageri.clase.VerificareBilet;
import ro.ase.cts.pasageri.clase.VerificarePasaport;

public class ImbarcareFacade  {
    private VerificareBilet bilet;
    private VerificareBagaj bagaj;
    private VerificarePasaport pasaport;

    public ImbarcareFacade() {
        this.bilet = new VerificareBilet();
        this.bagaj = new VerificareBagaj();
        this.pasaport = new VerificarePasaport();
    }

    public void imbarcaPasager(Imbarcare imbarcare)
    {
        if(bilet.eValid(imbarcare))
        {
            if(bagaj.eSigur(imbarcare))
            {
                if(pasaport.areViza(imbarcare))
                {
                    System.out.println("Pasagerul a fost imbarcat");
                }
                else
                {
                    System.out.println("Pasagerul nu are viza");
                }
            }
            else
            {
                System.out.println("In bagaj au fost gasite lucruri suspecte...");
            }

        }
        else
        {
            System.out.println("Biletul nu este valid");
        }
    }
}
