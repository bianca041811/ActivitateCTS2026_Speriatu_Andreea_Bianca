package ro.ase.cts.catalogMagazin.main;

import ro.ase.cts.catalogMagazin.clase.Categorie;
import ro.ase.cts.catalogMagazin.clase.Produs;
import ro.ase.cts.catalogMagazin.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Categorie magazin = new Categorie("Magazin IT");

        Categorie calculatore= new Categorie("Calculatoare");
        Categorie telefoane =  new Categorie("Telefoane");

        Structura lenovo = new Produs("Lenovo",3000);
        Structura hp=new Produs("HP",3002);
        Structura asus=new Produs("Asus",3500);
        Structura samsung = new Produs("Samsung",2000);
        Structura iphone = new Produs("IPhone",4000);

        calculatore.adaugaCategorie(lenovo);
        calculatore.adaugaCategorie(hp);
        calculatore.adaugaCategorie(asus);
        telefoane.adaugaCategorie(samsung);
        telefoane.adaugaCategorie(iphone);

        magazin.adaugaCategorie(calculatore);
        magazin.adaugaCategorie(telefoane);

        magazin.afiseazaDetalii(" ");
    }
}
