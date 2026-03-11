package Unidad_1_GUI.src;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {
    public Ejercicio2() {
        setTitle("Ejercicio de Paneles");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Creación de contenedores intermedios
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.RED); // Color para identificarlo visualmente
        panelNorte.add(new JLabel("Panel Norte (Encabezado)"));

        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.WHITE);
        panelCentro.add(new JLabel("Panel Central (Contenido Principal)"));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.BLUE);
        panelSur.add(new JLabel("Panel Sur (Pie de página)"));

        // Agregamos los paneles especificando su posición geográfica
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}

