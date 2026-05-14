package ro.ase.cts.spitalNou.facade;

import ro.ase.cts.spitalNou.clase.Internare;
import ro.ase.cts.spitalNou.clase.VerficareMedicDisponibil;
import ro.ase.cts.spitalNou.clase.VerificareDosarMedical;
import ro.ase.cts.spitalNou.clase.VerificarePatDisponibil;

public class InternareFacade {
    private VerficareMedicDisponibil medic;
    private VerificareDosarMedical dosar;
    private VerificarePatDisponibil pat;

    public InternareFacade() {
        this.medic = new VerficareMedicDisponibil();
        this.dosar = new VerificareDosarMedical();
        this.pat = new VerificarePatDisponibil();
    }

    public VerficareMedicDisponibil getMedicDisponibil() {
        return medic;
    }

    public VerificareDosarMedical getDosarMedical() {
        return dosar;
    }

    public VerificarePatDisponibil getPat() {
        return pat;
    }

    public void verifica(Internare internare)
    {
        if(pat.estePatDisponibil(internare))
        {
         if(medic.esteMedicDisponibil(internare))
         {
             if(dosar.esteDosarComplet(internare))
             {
                 System.out.println("Pacientul a fost internat cu succes!");
             }
             else
             {
                 System.out.println("Dosarul nu este complet");
             }

         }
         else
         {
             System.out.println("Nu exista medic disponibil ");
         }
        }
        else
        {
            System.out.println("Nu exista pat disponibil!");
        }
    }


}
