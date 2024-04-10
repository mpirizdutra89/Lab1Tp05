/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import vista.VistaGestionProducto;

/**
 *
 * @author Martin
 */
public class Main {
    private static  VistaGestionProducto vgp;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vgp = new VistaGestionProducto();
        vgp.setLocationRelativeTo(null);
        vgp.setVisible(true);
    }
    
    //Para levantar show dialogo  . El tipo es 0 o 1 , donde 0 es de info y 1 de warning
    public static void viewDialogo(String msj, String titulo, int tipo) {
        JOptionPane.showMessageDialog(vgp, msj, titulo, tipo);
    }

    public static void viewDialogo(String msj, int tipo) {
        JOptionPane.showMessageDialog(vgp, msj, "", tipo);
    }

}
