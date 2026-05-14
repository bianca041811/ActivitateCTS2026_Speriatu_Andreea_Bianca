package ro.ase.cts.biblioteca.main;

import ro.ase.cts.biblioteca.clase.Carte;
import ro.ase.cts.biblioteca.clase.Structura;
import ro.ase.cts.biblioteca.clase.Subcategorie;

public class Main {
    public static void main(String[] args) {
        Subcategorie catalogCarti=new Subcategorie("Catalog de carti");

        Subcategorie categoriiPrincipale=new Subcategorie("Categorii pricipale");
        Subcategorie subcategorii=new Subcategorie("Subcategorie");
        Subcategorie cartiIndividuale= new Subcategorie("Carti Individuale");

        Structura carte1=new Carte("Expeditie in Laponia", "mircea Cel Batran");
        Structura carte2 = new Carte("Ciresarii", "Constantin Chirita");
        Structura carte3= new Carte ("Ciresarii , Capitolul 1","Constantin Chirita ");
        Structura carte4= new Carte ("Ciresarii , Capitolul 2","Constantin Chirita");


        categoriiPrincipale.adaugaCagorie(carte2);
        subcategorii.adaugaCagorie(carte3);
        subcategorii.adaugaCagorie(carte4);
        cartiIndividuale.adaugaCagorie(carte1);

        catalogCarti.adaugaCagorie(categoriiPrincipale);
        catalogCarti.adaugaCagorie(subcategorii);
        catalogCarti.adaugaCagorie(cartiIndividuale);

        catalogCarti.afiseazaCatalogCarti("  ");

    }
}
