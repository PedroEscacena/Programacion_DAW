package examenes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número impar mayor o igual de 5: ");
        int num = sc.nextInt();
        if (num % 2 == 0 || num < 5) {
            System.out.println("La altura introducida no es correcta");
        } else {
            for (int i = 0; i < num; i++) {

                for (int j = 0; j < 6; j++) {//He puesto 6 porque en los ejemplos siempre es 6

                    if (i == 0 || j == 0 || j == 5 || i == num / 2 || i == num - 1) {
                        System.out.print("M");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println("");
            }
        }

    }
}
