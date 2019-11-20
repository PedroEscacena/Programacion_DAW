package ejerciciosExamen;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número (inferior a 1 para acabar): ");
        int num = sc.nextInt();


        while (num > 0) {

            String guardado_numero = "";
            int cont_digitos_eliminados = 0;

            while (num > 0) {
                int local = num % 10;
                if (local == 0 || local == 8) {
                    cont_digitos_eliminados++;
                } else {
                    guardado_numero += local;
                }
                num = num / 10;
            }


            if (guardado_numero != "") {

                int num_guardado_inverso = Integer.parseInt(guardado_numero);


                guardado_numero = "";
                while (num_guardado_inverso > 0) {
                    int local = num_guardado_inverso % 10;

                    guardado_numero += local;
                    num_guardado_inverso = num_guardado_inverso / 10;
                }
                System.out.println("Número resultado: " + guardado_numero + '\n' +
                        "Digitos eliminados: " + cont_digitos_eliminados);
            }

            System.out.println("Introduzca el número (inferior a 1 para acabar): ");
            num = sc.nextInt();

        }
    }
}
