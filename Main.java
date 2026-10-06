import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(
                Masa.MADRE,
                Salsa.NORMAL,
                Topping.PEPPERONI
        );

        pizza1.agregarIngrediente(Topping.CARNE);

        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza1);

        Orden orden1 = new Orden(1, true, pizzas);

        Orden[] ordenes = new Orden[5];

        Cocina cocina = new Cocina(2, ordenes);

        cocina.agregarOrden(orden1);

        System.out.println("Orden Creada");
        System.out.println("-------------");
        System.out.println(orden1);
    }
}