package Unidad_1_GUI.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Ejercicio 5: Evento de Ratón (MouseListener).
 * La etiqueta cambia de color cuando el ratón entra en su área.
 */
public class Ejercicio5 extends JFrame {

    public Ejercicio5() {
        setTitle("Ejercicio 5: MouseListener");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        JLabel etiqueta = new JLabel("Pasa el ratón por aquí", SwingConstants.CENTER);
        etiqueta.setPreferredSize(new Dimension(200, 50));
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.LIGHT_GRAY);

        // Implementación del evento de ratón usando MouseAdapter
        etiqueta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                etiqueta.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restauramos el color original al salir el puntero
                etiqueta.setBackground(Color.LIGHT_GRAY);
            }
        });

        add(etiqueta);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio5().setVisible(true);
        });
    }
}