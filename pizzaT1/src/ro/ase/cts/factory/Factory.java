package ro.ase.cts.factory;

import ro.ase.cts.clase.*;

import java.nio.channels.Pipe;

public class Factory {
    public IPizza getPizza(TipPizza tip, String nume,Integer gramaj, Integer pret,boolean extra){
        switch (tip){
            case TipPizza.DIAVOLA ->
            {
                Diavola diavola=new Diavola(nume, gramaj, pret,extra);
                return new Diavola(nume, gramaj, pret,extra);
            }
            case TipPizza.MARGHERITA ->
            {
                Margherita margherita= new Margherita(nume,  gramaj, pret,extra);
                return new Margherita(nume, gramaj , pret, extra);
            }
            case TipPizza.PEPPERONI ->
            {
                Pepperoni pepperoni = new Pepperoni(nume,gramaj ,pret, extra);
                return new Pepperoni(nume, gramaj, pret, extra);
            }
            default -> {return null;}
        }
    }
}
