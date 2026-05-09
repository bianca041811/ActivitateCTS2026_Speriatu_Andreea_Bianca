package ro.ase.cts.stb.aplicatie_metrou;

import ro.ase.cts.stb.aplicatie_stb.ValidatorSTB;

public class AdaptorValidatorStb extends ValidatorSTB{
    private ValidatorMetrou validatorMetrou;

    public AdaptorValidatorStb(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBiletSTB()
    {
        validatorMetrou.valideazaBiletMetrou();
    }
}
