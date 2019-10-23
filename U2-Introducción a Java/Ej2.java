package pruebas;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo");
        int num = sc.nextInt();

        String numCadena = Integer.toString(num);
        String mitad = "";
        String mitad2 = "";
        if (num > 0) {

            for (int i = 0; i < (numCadena.length() / 2); i++) {//Guardo en una variable la primera mitad del numero
                mitad += numCadena.charAt(i);
            }

            if (numCadena.length() % 2 == 0) {
                //Dependiendo de si la longitud es par o no
                // habrá que quitar el número que se encuentra a la mitad y guarda la otra mitad de la variable


                for (int i = numCadena.length() - 1; i >= (numCadena.length() / 2); i--) {//Para longitud par
                    mitad2 += numCadena.charAt(i);
                }
            } else {
                for (int i = numCadena.length() - 1; i >= (numCadena.length() / 2) + 1; i--) {//Longitud impar
                    mitad2 += numCadena.charAt(i);
                }

            }
            if (mitad.equals(mitad2)) {//Como lo hemos convertido a string hay que usar equals
                System.out.println("El " + num + " es capicúa");
            } else {
                System.out.println("El " + num + " no es capicúa");
            }
        }else{
            System.out.println("ERROR");
        }

    }
}
