import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Crear Orden");

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);
        ventana.setLocationRelativeTo(null);

        ventana.setLayout(new GridLayout(5, 2));

        ventana.add(new JLabel("Numero:"));
        ventana.add(new JTextField());

        ventana.add(new JLabel("Masa:"));
        ventana.add(new JComboBox<>(Masa.values()));

        ventana.add(new JLabel("Salsa:"));
        ventana.add(new JComboBox<>(Salsa.values()));

        ventana.add(new JLabel("Topping:"));
        ventana.add(new JComboBox<>(Topping.values()));

        ventana.add(new JButton("Crear Orden"));

        ventana.setVisible(true);
    }
}