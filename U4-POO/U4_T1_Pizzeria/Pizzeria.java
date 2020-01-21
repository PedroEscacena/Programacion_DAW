package pruebaPizzeria;

import java.util.Calendar;

public class Pizzeria {

    private Pedidos[] pedidos;
    private int numpedidos;

    Pizzeria() {
        pedidos = new Pedidos[5];
        numpedidos = 0;
    }

    Pizzeria(int tamPedidos) {
        pedidos = new Pedidos[tamPedidos];
        numpedidos = 0;
    }

    public boolean addpedido(Pedidos pedidos2) {
        if (numpedidos < 5) {
            pedidos[numpedidos] = pedidos2;
            numpedidos++;
            return true;
        }
        return false;
    }

    public String mostrarPedidos() {
        String local = "";
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] != null) {
                local += '\n' + "Pedido: " + i +'\n'+ pedidos[i].devHora() + '\n' + pedidos[i].getPizza().mostrarPizza();
            }
        }
        return local;

    }

    public int mostrarNumPedidos() {
        return numpedidos;
    }
}
