package ro.ase.cts.restaurant.clase;

public class Restaurant implements IRestaurant {
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMasa(Client client) {
        System.out.println("Rezervare realizata pentru clientul  "+client.getNume()+" la restaurantul "+this.nume);
    }
}
