package ejerciciosExamen;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca horas: ");
        long horas = sc.nextInt();
        System.out.println("Introduzca minutos: ");
        long minutos = sc.nextInt();
        System.out.println("Introduzca segundos: ");
        long segundos = sc.nextInt();

        System.out.println("Introduzca segundos a incrementar: ");
        long suma_segundos = sc.nextInt();


        for (int i = 0; i < suma_segundos; i++) {
            segundos = segundos + 1;
            if (segundos == 60) {
                segundos = 0;
                minutos = minutos + 1;
            }
            if (minutos == 60) {
                minutos = 0;
                horas = horas + 1;
            }
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }


    }
}
