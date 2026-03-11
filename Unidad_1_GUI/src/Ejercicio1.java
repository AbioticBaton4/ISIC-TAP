package Unidad_1_GUI.src;

import javax.swing.JFrame;

public class Ejercicio1 extends JFrame {
    public Ejercicio1() {
        // 1. Define el texto que aparece en la barra superior
        setTitle("Mi Primera Ventana - TAP"); 
        
        // 2. Define el ancho y alto inicial en píxeles
        setSize(500, 500); 
        
        // 3. Indica que la aplicación debe cerrarse al presionar la 'X'
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // 4. Si el parámetro es 'null', la ventana aparece centrada en la pantalla
        setLocationRelativeTo(null); 
        
        // 5. Por defecto las ventanas nacen invisibles. Este paso es obligatorio.
        setVisible(true); 
    }

    public static void main(String[] args) {
        new Ejercicio1();
    }
}