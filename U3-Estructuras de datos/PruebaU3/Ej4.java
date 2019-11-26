package Pruebas2;

public class Ej4 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2342, 5557};
        int[] c = {67, 34, 234, 98, 22, 45};
        System.out.println("Array pasado a String: "+ convierteArrayEnString(a));
    }

    public static String convierteArrayEnString(int[] a) {
        String numeros = "";

        for (int i = 0; i < a.length; i++) {
            numeros += a[i] + " ";
        }

        return numeros;
    }
}
