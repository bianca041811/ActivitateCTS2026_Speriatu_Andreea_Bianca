package ro.ase.cts.GPS.gpsVechi;

import ro.ase.cts.GPS.gpsNou.GpsNou;

public class AdaptorGpsVechi extends GpsNou{
    private GpsVechi gpsVechi;

    public AdaptorGpsVechi(GpsVechi gpsVechi) {
        this.gpsVechi = gpsVechi;
    }

    public void gasesteMasina()
    {
        gpsVechi.localizeazaMasina();
    }
}
