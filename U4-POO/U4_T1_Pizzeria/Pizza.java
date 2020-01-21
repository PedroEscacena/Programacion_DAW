package pruebaPizzeria;

import java.util.Arrays;

public class Pizza {

    private Tamanyo tamanyo;
    private int numIngrediente;
    private Ingrediente[] ingredientes = new Ingrediente[3];


    Pizza(Tamanyo tamanyo, Ingrediente[] ingredientes2) {
        numIngrediente = 0;
        setTamanyo(tamanyo);
        setIngredientes(ingredientes2);
    }

    Pizza() {
        numIngrediente = 0;
        this.tamanyo = Tamanyo.FAMILIAR;
        addIngrediente(new Ingrediente("Jamon", 223));
        addIngrediente(new Ingrediente());
    }

    public String mostrarPizza() {

        String local = "";
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null) {
                local += ingredientes[i].getNombre() + ", " + ingredientes[i].getCalorias() + " ";
            }
        }


        return "//Pizza//" + '\n' + "Tamaño: " + getTamanyo() + '\n' + "Ingredientes: " + local;

    }


    public int getNumIngrediente() {
        return numIngrediente;

    }

    public boolean addIngrediente(Ingrediente ingrediente) {
        if (numIngrediente >= 3) {
            return false;
        } else {
            ingredientes[numIngrediente] = ingrediente;
            numIngrediente++;
            return true;
        }
    }


    Tamanyo getTamanyo() {
        return tamanyo;
    }

    private void setTamanyo(Tamanyo tamanyo) {
        this.tamanyo = tamanyo;
    }

    private Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    private void setIngredientes(Ingrediente[] ingredientes2) {
        if (ingredientes2.length <= ingredientes.length) {
            this.ingredientes = ingredientes2;
        } else {
            System.out.println("ERROR AL INTRODUCIR INGREDIENTE");
        }
    }

}
