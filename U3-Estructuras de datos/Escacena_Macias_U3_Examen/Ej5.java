package paquete_examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        do {
            System.out.println("Indique qué desea hacer(1-->Unir/ 2-->rotar): ");
            opc = sc.nextInt();
        } while (opc<0 || opc>2);

        switch (opc) {
            case 1:

                char[] vector1 = {'a', 'b', 'c'};
                System.out.println("Vector 1: "+'\n'+Arrays.toString(vector1));
                char[] vector2 = {'d', 'e', 'f'};
                System.out.println("Vector 2: "+'\n'+Arrays.toString(vector2));
                System.out.println("Array unido: "+'\n' + Arrays.toString(VectoresExamen.unir(vector1, vector2)));

                break;
            case 2:
                char[] vector_rotar = {'a', 'b', 'c', 'd', 'e', 'f'};
                int posic;

                do {
                    System.out.println("Indique el número de vueltas(No vale 0 ni negativos)");
                    posic = sc.nextInt();
                } while (posic <= 0);
                System.out.println("ARRAY SIN ROTAR: " + '\n' + Arrays.toString(vector_rotar));
                System.out.println("ARRAY ROTADO: " + '\n' + Arrays.toString(VectoresExamen.rotar(vector_rotar, posic)));

                break;
            default:
                break;
        }


    }
}
