package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinantata=20;

	public static float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	

	@Override
	public String toString() {
		StringBuilder sbStudent = new StringBuilder();
		sbStudent.append("Student{");
		sbStudent.append(super.toString());
		sbStudent.append(", facultate='").append(this.facultate).append('\'');
		sbStudent.append(", an_studii=").append(this.an_studii);
		sbStudent.append("}");
		return sbStudent.toString();
	}
	
	
	public void afisareVenit() {

		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+Student.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
