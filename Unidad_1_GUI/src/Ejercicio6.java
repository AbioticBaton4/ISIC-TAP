package Unidad_1_GUI.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Ejercicio 6: Evento de Teclado (KeyListener).
 * Actualiza un contador de caracteres conforme el usuario escribe.
 */
public class Ejercicio6 extends JFrame {

    public Ejercicio6() {
        setTitle("Ejercicio 6: KeyListener");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        setLocationRelativeTo(null);

        JTextField campo = new JTextField(20);
        JLabel contador = new JLabel("Caracteres: 0");

        // Implementación del evento de teclado para detectar cuando se suelta una tecla
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int total = campo.getText().length();
                contador.setText("Caracteres: " + total);
            }
        });

        add(new JLabel("Escribe algo: "));
        add(campo);
        add(contador);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio6().setVisible(true);
        });
    }
}