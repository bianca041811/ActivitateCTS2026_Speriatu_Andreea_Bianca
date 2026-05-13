package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Meniu;
import ro.ase.cts.restaurant.clase.Sectiune;
import ro.ase.cts.restaurant.clase.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune meniuRestaurant= new Sectiune("Meniu Restaurant");

        Sectiune bauturi= new Sectiune("Bauturi");
        Sectiune sucuri = new Sectiune("Sucuri");
        Sectiune cafea =  new Sectiune("Cafea");
        Sectiune mancare = new Sectiune("Mancare");
        Sectiune desert = new Sectiune("Desert");

        Meniu apaPlata= new Subsectiune("Apa plata",5);
        Meniu apaMinerala= new Subsectiune("Apa minerala",6);
        Meniu cola = new Subsectiune("cola",8);
        Meniu fanta = new Subsectiune("fanta",8);
        Meniu latte= new Subsectiune("latte",15);
        Meniu piure= new Subsectiune("Piure",15);
        Meniu papanasi = new Subsectiune("Papanasi",30);

        sucuri.adaugaSectiune(cola);
        sucuri.adaugaSectiune(fanta);

        cafea.adaugaSectiune(latte);


        mancare.adaugaSectiune(piure);

        bauturi.adaugaSectiune(apaPlata);
        bauturi.adaugaSectiune(apaMinerala);
        bauturi.adaugaSectiune(sucuri);
        bauturi.adaugaSectiune(cafea);

        desert.adaugaSectiune(papanasi);

        meniuRestaurant.adaugaSectiune(bauturi);
        meniuRestaurant.adaugaSectiune(mancare);
        meniuRestaurant.adaugaSectiune(desert);

        meniuRestaurant.afiseazaMeniu("");

    }
}
