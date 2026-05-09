package ro.ase.cts.stb.main;

import ro.ase.cts.stb.aplicatie_metrou.AdaptorValidatorStb;
import ro.ase.cts.stb.aplicatie_metrou.ValidatorMetrou;
import ro.ase.cts.stb.aplicatie_stb.ValidatorSTB;

public class Main {
    public static void valideazaBilet(ValidatorSTB validatorSTB)
    {
        validatorSTB.valideazaBiletSTB();
    }

    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
        ValidatorSTB validatorSTB =new ValidatorSTB();

       valideazaBilet(validatorSTB);

        AdaptorValidatorStb validatorAdaptat = new AdaptorValidatorStb(validatorMetrou);
        valideazaBilet(validatorAdaptat);

    }
}
