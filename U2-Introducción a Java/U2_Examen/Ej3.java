package ejerciciosExamen;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud_decimo_sin_favs;//Esta variable la usamos para introducir la longitud del décimo
        String esta_num_favorito = "";//Aquí guardamos los número que estén en la lotería y sea un número favorito

        System.out.println("Introduzca sus 3 números favoritos seguidos: ");
        String num_suerte = sc.nextLine();
        System.out.println("Introduzca el número de la lotería: ");
        String num_loteria = sc.nextLine();

        longitud_decimo_sin_favs = num_loteria.length();//Guardado de la longitud del décimo


        for (int i = 0; i < num_suerte.length(); i++) {
            for (int j = 0; j < num_loteria.length(); j++) {//Comprobamos número por número si alguno de los 3 números favoritos
                if (num_suerte.charAt(i) == num_loteria.charAt(j)) {//está en el de la lotería
                    esta_num_favorito += num_loteria.charAt(j);//Añadimos el número que está en esta variable
                    longitud_decimo_sin_favs--;//A la longitud de la lotería le quitamos 1 si se encuentra una concurrencia
                }
            }
        }
        if (esta_num_favorito.length() > longitud_decimo_sin_favs) {
            System.out.println("Ese número le va a dar suerte");
        } else {
            System.out.println("Ese número no le va a dar suerte");
        }
    }
}
