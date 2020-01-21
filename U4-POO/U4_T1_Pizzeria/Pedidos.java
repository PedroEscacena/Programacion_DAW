package pruebaPizzeria;

import java.util.Calendar;

public class Pedidos {

    Calendar horaPedido;
    Pizza pizza;

    Pedidos(Pizza pizza) {
        setPizza(pizza);
        Calendar horaPedido = Calendar.getInstance();
    }

    Pedidos() {
        setPizza(new Pizza());
        horaPedido = Calendar.getInstance();
    }

    public Pizza getPizza() {
        return pizza;
    }

    String devHora() {
        String local = "";
        local += " Dia: " + Integer.toString(horaPedido.get(Calendar.DATE)) + " ";
        local += " Mes: " + Integer.toString(horaPedido.get(Calendar.MONTH)) + " ";
        local += " Año: " + Integer.toString(horaPedido.get(Calendar.YEAR)) + " ";
        return local;
    }


    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
