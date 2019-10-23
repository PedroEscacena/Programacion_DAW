package pruebas;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota primer control");
        double nota1 = sc.nextInt();
        System.out.println("Nota segundo control");
        double nota2 = sc.nextInt();
        double media = (nota1 + nota2) / 2;
        String pregunta = "";
        if (media >= 5) {
            if (media >= 5 && media < 6) {
                System.out.println("Tu nota de programación es: " + media + " -Suficiente");
            } else if (media >= 6 && media < 7) {
                System.out.println("Tu nota de programación es: " + media + " -Bien");
            } else if (media >= 7 && media < 9) {
                System.out.println("Tu nota de programación es: " + media + " -Notable");
            } else {
                System.out.println("Tu nota de programación es: " + media + " -Sobresaliente");
            }
        } else if (media < 5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            sc.nextLine();
            pregunta = sc.nextLine();

            if (pregunta.equals("apto")) {
                System.out.println("Tu nota de programación es: 5 -Suficiente");
            } else if (pregunta.equals("no apto")) {
                System.out.println("Tu nota de programación es: " + media + " -Suspenso");
            }

        }
    }
}
