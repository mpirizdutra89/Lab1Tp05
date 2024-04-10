/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Categorias;
import modelo.EncabezadosTable;
import modelo.Producto;
import vista.VistaGestionProducto;

/**
 *
 * @author nn
 */
public class ControladorVistaGestionProducto {
    
   private static DefaultTableModel modeloTable;
   private static VistaGestionProducto vgp;
   private static ArrayList<Producto> listaProducto;
    
    public static void cargarInstancia(VistaGestionProducto vgp2) {
        vgp = vgp2;
        listaProducto = new ArrayList<>();
        modeloTable = new DefaultTableModel() {
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        armarComboBx();
        armarCabeceraTabla();
    }
    
    private static void armarComboBx(){
        
        vgp.getJCBCategoria().addItem("Seleccione rubro");
        for (Categorias rubro : Categorias.values()) {
            vgp.getJCBCategoria().addItem(rubro.toString());

        }
      
    }
    
    private static void armarCabeceraTabla() {
        for (EncabezadosTable encabezado : EncabezadosTable.values()) {
            modeloTable.addColumn(encabezado.toString());
        }

        vgp.getJTable1().setModel(modeloTable);

    }
    //Metodo que solo permite la entrada de nuemro y un punto y dos decimales
    public static void soloNumerosGetJTFPrecio(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
            evt.consume();
        } else if (c == '.' && vgp.getJTFPrecio().getText().isEmpty()) {
            evt.consume();
        } else if (c == '.' && vgp.getJTFPrecio().getText().contains(".")) {

            evt.consume();
        } else if (Character.isDigit(c) && vgp.getJTFPrecio().getText().contains(".")) {

            String text = vgp.getJTFPrecio().getText();
            int dotIndex = text.indexOf('.');
            int digitsAfterDot = text.length() - dotIndex - 1;
            if (digitsAfterDot >= 2) {
                evt.consume();
            }
        }
    }
    
    
}
