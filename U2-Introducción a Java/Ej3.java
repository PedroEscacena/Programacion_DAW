package pruebas;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        int num = sc.nextInt();

        String binario = "";
        String inverso="";
        while (num >= 2) {


            if (num % 2 == 0) {
                binario = binario + '0';
                num = num / 2;
            } else {
                binario = binario + '1';
                num = num / 2;
            }
            if (num==1){
                binario=binario+'1';
            }

        }
        for (int i = binario.length()-1; i >=0 ; i--) {
         inverso= inverso+  binario.charAt(i);
        }

        System.out.println("El número " + num + " en binario es: " + inverso);

    }
}
