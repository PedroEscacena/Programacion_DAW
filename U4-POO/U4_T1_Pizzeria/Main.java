package pruebaPizzeria;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Ingrediente i1 = new Ingrediente();


        Ingrediente[] arrayIng = {i1};


        Pizza p2 = new Pizza(Tamanyo.MEDIANA, arrayIng);

        /*System.out.println(p2.mostrarPizza());
        System.out.println(p1.mostrarPizza());
        System.out.println(p1.addIngrediente(i1));
        System.out.println(p1.mostrarPizza());
        System.out.println(p1.addIngrediente(i1));
        System.out.println(p1.mostrarPizza());
        System.out.println(p1.getNumIngrediente());*/

        Pedidos ped1 = new Pedidos();
        Pizzeria pz1 = new Pizzeria();
        pz1.addpedido(ped1);
        pz1.addpedido(ped1);
        pz1.addpedido(ped1);
        pz1.addpedido(ped1);
        System.out.println(pz1.mostrarNumPedidos());

        System.out.println(pz1.mostrarPedidos());

    }
}
