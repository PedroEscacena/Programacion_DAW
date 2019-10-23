package pruebas;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número impar mayor de 3");
        int altura = sc.nextInt();
        if (altura%2!=0) {

            for (int i = 0; i < (altura / 2) + 1; i++) {

                for (int j = 0; j < (altura / 2) - i; j++) {
                    System.out.print(" ");
                }

                System.out.println("*     *");
            }

            for (int i = 0; i < (altura / 2); i++) {

                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }

                System.out.println("*     *");

            }
        }else{
            System.out.println("ERROR AL INTRODUCIR DATO");
        }

    }

}