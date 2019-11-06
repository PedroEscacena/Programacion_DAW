package examenes;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int contador = 0;
        int mayor = 0;
        int menor = 0;
        boolean esprimo = false;


        do {

            System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
            int local = sc.nextInt();

            for (int i = 1; i < local; i++) {//Comprobación de si es primo
                if (local % i == 0 && i != 1) {
                    esprimo = false;
                    break;
                } else {
                    esprimo = true;
                }
            }

            if (!esprimo) {//Por si el primer número es primo

                if (contador == 0) {
                    mayor = local;
                    menor = local;
                }

                if (local > mayor) {
                    mayor = local;
                } else if (local < menor) {
                    menor = local;
                }

                total += local;
                contador++;
            }


        } while (!esprimo);
        System.out.println("Ha introducido " + (contador) + " no números primos" + '\n'
                + "Máximo " + mayor + '\n' + "Mínimo " + menor + '\n' + "Media " + (total / contador));


    }
}
