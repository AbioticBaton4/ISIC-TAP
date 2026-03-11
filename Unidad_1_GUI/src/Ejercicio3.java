package Unidad_1_GUI.src;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3 extends JFrame {
    /**
     * Constructor que inicializa la ventana principal con sus componentes.
     */
    public Ejercicio3() {
        // Establece el título de la ventana
        setTitle("Comparativa de Layouts");
        
        // Define el tamaño de la ventana (ancho x alto)
        setSize(400, 300);
        
        // Cierra la aplicación cuando se cierra la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Define un GridLayout de 3 filas, 2 columnas con espaciado de 5 píxeles
        setLayout(new GridLayout(3, 2, 5, 5)); 
        
        // Añade 6 botones a la ventana
        for(int i = 1; i <= 6; i++) {
            add(new JButton("Botón " + i));
        }
        
        // Hace visible la ventana
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Crea una nueva instancia de la ventana principal
        new Ejercicio3();
    }
}
