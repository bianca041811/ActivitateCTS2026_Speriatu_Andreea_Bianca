package ro.ase.cts.CompanieSoftware.clase;

public class AutetificareParola implements ModAutentificare{
    @Override
    public void autentifica(String numeUtilizator) {
        System.out.println("Utilizatorul "+numeUtilizator+" s-a autentificat prin parola!");
    }
}
