import java.util.ArrayList;

public class Orden {

    private int numero;
    private boolean pendiente;
    private ArrayList<Pizza> pizzas;

    public Orden(int numero, boolean pendiente,
                 ArrayList<Pizza> pizzas) {

        this.numero = numero;
        this.pendiente = pendiente;
        this.pizzas = pizzas;
    }

    public boolean cambiarEstado(boolean pendiente) {
        this.pendiente = pendiente;
        return this.pendiente;
    }

    @Override
    public String toString() {
        return "Orden #" + numero
                + "\nPendiente: " + pendiente
                + "\nPizzas: " + pizzas;
    }
}