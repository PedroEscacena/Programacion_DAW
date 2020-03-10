package ExamenU7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Propietario p1 = new Propietario("juan", "Escacena", 123, "Italia");
        Propietario p2 = new Propietario("Pedro", "Escacena", 124, "Espanya");
        Propietario p3 = new Propietario("Jose", "Escacena", 125, "Rumania");

        Perro perr1 = new Perro("Chica", 7, 12.3, true, p2, "Bulldog");
        Perro perr2 = new Perro("Lola", 7, 12.3, true, p3, "Caniche");
        Perro perr3 = new Perro("Tapon", 7, 12.3, true, p2, "Labrador");
        Perro perr4 = new Perro("Vicente", 7, 12.3, true, p1, "Bulldog");
        Perro perr5 = new Perro("Lasi", 7, 12.3, true, p2, "Labrador");
        Perro perr6 = new Perro("Laso", 7, 12.3, true, p3, "Caniche");
        Perro perr7 = new Perro("Lase", 7, 12.3, true, p2, "Mastin");
        Perro perr8 = new Perro("Lasu", 7, 12.3, true, p1, "Mastin");
        Perro perr9 = new Perro("Chispi", 7, 12.3, true, p2, "Mastin");
        Perro perr0 = new Perro("Yina", 7, 12.3, true, p1, "Bulldog");

        Concurso c1 = new Concurso("Premios", "Bormujos", perr1);
        c1.addDog("Bulldog", perr1);
        c1.addDog("Caniche", perr2);
        c1.addDog("Bulldog", perr2);
        c1.addDog("Bulldog", perr4);
        c1.addDog("Labrador",perr5);
        c1.addDog("Labrador",perr8);
        c1.addDog("Mastin",perr8);

        System.out.println(c1.toString());
        c1.mostrarPerros();
        c1.guardarPerros();
        c1.cargarPerros();
    }
}
