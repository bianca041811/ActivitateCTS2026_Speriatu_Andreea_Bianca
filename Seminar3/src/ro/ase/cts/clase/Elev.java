package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantata=30;

	public static float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sbElev= new StringBuilder();
		sbElev.append("Elev{");
		sbElev.append(super.toString());
		sbElev.append(", clasa=").append(this.clasa);
		sbElev.append(", tutore='").append(this.tutore).append('\'');
		sbElev.append("}");
		return sbElev.toString();
	}
	
	public Elev() {
		super();
	}
	

	
	public void afisareVenit() {

		System.out.println("Elevul "+getNume()+" "+getPrenume()+" primeste"+Elev.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
