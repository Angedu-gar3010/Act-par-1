import java.util.ArrayList;

public class Pizza {

    private Masa tipoBase;
    private Salsa tipoSalsa;
    private ArrayList<Topping> toppings;

    public Pizza(Masa tipoBase, Salsa tipoSalsa, Topping ingrediente) {
        this.tipoBase = tipoBase;
        this.tipoSalsa = tipoSalsa;

        toppings = new ArrayList<>();
        toppings.add(ingrediente);
    }

    public Pizza(Masa tipoBase, Salsa tipoSalsa,
                 ArrayList<Topping> ingredientes) {

        this.tipoBase = tipoBase;
        this.tipoSalsa = tipoSalsa;
        this.toppings = ingredientes;
    }

    public void agregarIngrediente(Topping ingrediente) {
        toppings.add(ingrediente);
    }

    public void agregarIngrediente(ArrayList<Topping> ingredientes) {
        toppings.addAll(ingredientes);
    }

    @Override
    public String toString() {
        return "Masa: " + tipoBase
                + ", Salsa: " + tipoSalsa
                + ", Toppings: " + toppings;
    }
}