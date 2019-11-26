package Pruebas2;

public class Ej5 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2342, 5557};
        int[] c = {67, 34, 234, 98, 22, 45};

        System.out.println("Número posición aleatoria: " + aleatorioDeArray(a));

        //System.out.println("Número posición aleatoria: " + aleatorioDeArray(b));

        //System.out.println("Número posición aleatoria: " + aleatorioDeArray(c));
    }

    public static int aleatorioDeArray(int[] a) {
        int local = 0;
        local = (int) (Math.random() * a.length);
        System.out.println("Posición: " + local);
        return a[local];

    }
}
