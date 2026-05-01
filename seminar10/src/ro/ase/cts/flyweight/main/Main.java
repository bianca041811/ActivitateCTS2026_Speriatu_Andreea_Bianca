package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.ClientAbstract;
import ro.ase.cts.flyweight.clase.RegistrulClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistrulClienti registru=new RegistrulClienti();
        ClientAbstract client1= registru.getClient("Ana","07453654832","ana@gmail.com");
        ClientAbstract client2= registru.getClient("Bogdan","07456382344","bogdan2gmail.com");
        Rezervare rezervare1=new Rezervare(12,"17:50",3);
        Rezervare rezervare2=new Rezervare(15,"18:50",2);

        client1.printeazaRezervare(rezervare1);
        client2.printeazaRezervare(rezervare2);


        registru.getClient("Andrei","07456382344","andrei@gmail.com").printeazaRezervare(rezervare2);
        registru.getClient("Andrei","07456382344","andrei@gmail.com").plateste(rezervare2,150);

        Rezervare rezervare3=new Rezervare(17,"20:00",3);
        registru.getClient("Ana","07453654832","ana@gmail.com").printeazaRezervare(rezervare3);

        registru.getClient("Ana","07453654832","ana@gmail.com").plateste(rezervare3,150);



    }
}
