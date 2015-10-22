/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiendaonline;

/**
 *
 * @author lclap
 */
public class Producto {
    String nombre;
    private double precio;
    int existencia;
    String descripcion;
    
    public Producto(String nombre, double precio, int existencia, String descripcion){
        this.nombre=nombre;
        this.precio=precio;
        this.existencia=existencia;
        this.descripcion=descripcion;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}
