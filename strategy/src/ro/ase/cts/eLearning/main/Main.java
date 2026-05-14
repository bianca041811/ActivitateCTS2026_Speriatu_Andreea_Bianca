package ro.ase.cts.eLearning.main;

import ro.ase.cts.eLearning.clase.PrimireMaterialeEmail;
import ro.ase.cts.eLearning.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Magdalena");

        student.primesteMateriale();

        student.setModPrimireMateriale(new PrimireMaterialeEmail());

        student.primesteMateriale();
    }
}
