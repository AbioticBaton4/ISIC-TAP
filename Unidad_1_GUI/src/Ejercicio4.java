package Unidad_1_GUI.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio4 extends JFrame {
    private JPanel panelPrincipal;
    private JButton btnRojo, btnAzul, btnVerde;

    public Ejercicio4() {
        setTitle("Manejo de Fuentes Multiples");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        panelPrincipal = new JPanel();
        panelPrincipal.setPreferredSize(new Dimension(350, 200));
        btnRojo = new JButton("Rojo");
        btnAzul = new JButton("Azul");
        btnVerde = new JButton("Verde");
        // Agregamos el mismo listener a los tres botones
        ActionListener manejador = e -> {
            Object fuente = e.getSource(); // Identificamos quién fue
            if (fuente == btnRojo) panelPrincipal.setBackground(Color.RED);
            if (fuente == btnAzul) panelPrincipal.setBackground(Color.BLUE);
            if (fuente == btnVerde) panelPrincipal.setBackground(Color.GREEN);
        };

        btnRojo.addActionListener(manejador);
        btnAzul.addActionListener(manejador);
        btnVerde.addActionListener(manejador);

        add(panelPrincipal);
        add(btnRojo);
        add(btnAzul);
        add(btnVerde);
        setVisible(true);
    }
        public static void main(String[] args) {
            new Ejercicio4();
        }

}
