package ro.ase.ro.builder.stbf3.clase;

public class AutobuzBuilder implements AutobuzBuilderAbstract{
    private Autobuz autobuz;

    public AutobuzBuilder(String nume){this.autobuz=new Autobuz(false,false,false,false, nume);}


    public AutobuzBuilder setAerConditionat(boolean areAerConditionat) {
        autobuz.aerConditionat = areAerConditionat;
        return this;
    }

    public AutobuzBuilder setWifi(boolean areWifi) {
        autobuz.wifi = areWifi;
        return this;

    }

    public AutobuzBuilder setUsiAutomate(boolean areUsiAutomate) {
        autobuz.usiAutomate = areUsiAutomate;
        return this;

    }

    public AutobuzBuilder setSistemAudio(boolean areSistemAudio) {
        autobuz.sistemAudio = areSistemAudio;
        return this;

    }
    public AutobuzBuilder setNumeAutobuz(String areNumeAutobuz) {
        autobuz.numeAutobuz = areNumeAutobuz;
        return this;
    }


    @Override
    public Autobuz build() {
        return this.autobuz;
    }
}

