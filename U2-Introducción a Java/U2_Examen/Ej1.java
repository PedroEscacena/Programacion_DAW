package ejerciciosExamen;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el tamaño de los calcetines(Debe ser mayor o igual a 4): ");
        int largo = sc.nextInt();
        while (largo < 4) {
            System.out.println("VUELVA A INTRODUCIR LA ALTURA(Debe ser mayor o igual a 4):");
            largo = sc.nextInt();
        }


        for (int i = 0; i < largo - 2; i++) {
            System.out.print("***     ***");
            System.out.println("");
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("******  ******");
            System.out.println("");
        }

    }
}
