/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


//Cuando el usuario seleccione una categoría en el ComboBox y haga clic en el botón "Agregar producto", el programa debe permitir al usuario ingresar el nombre y el precio del producto en campos de texto separados. 
//Luego, debe agregar el producto a la tabla con la categoría seleccionada.
/**
 *
 * @author nn
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private Categorias categoria;
    
    
    public Producto(String nombre, double precio, Categorias categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
    return String.format("Nombre: %s\nPrecio: %.2f\nCategoría: %s", nombre, precio, categoria);
    }  
}
