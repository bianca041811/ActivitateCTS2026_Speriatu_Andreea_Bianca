package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			ReaderAplicanti ra=new ReaderAngajati();
			listaAngajati = ra.readAplicanti("C:\\\\Users\\\\Bianca\\\\IdeaProjects\\\\ActivitateCTS2026_Speriatu_Andreea_Bianca\\\\Seminar2\\\\angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
