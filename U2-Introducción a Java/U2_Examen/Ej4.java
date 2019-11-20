package ejerciciosExamen;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean es_primo = false;

        System.out.println("Por favor, introduzca un número entero positivo: ");
        int num = sc.nextInt();
        while (num < 1) {
            System.out.println("Por favor, introduzca un número entero positivo: ");
            num = sc.nextInt();
        }

        for (int i = 2; i < num + 5; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    es_primo = true;
                    break;
                }

            }

            if (i >= num) {

                if (es_primo) {
                    System.out.println(i + " No es primo");
                } else {
                    System.out.println(i + " Es primo");
                }
            }


            es_primo = false;

        }
    }
}
