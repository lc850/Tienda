/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiendaonline;

import java.util.Date;

/**
 *
 * @author Dracke
 */
public class Factura{
    
   
   
    java.util.Date fecha = new Date();
    String Nombre;
    int Edad;
    String Direccion;
    String Productos;
    String Descripcion;
    double Total;
    
    
        public Factura(int Fecha,Cliente A,Producto B ){
            
            this.fecha = fecha;
            this.Nombre= A.getNombre();
            this.Edad= A.getEdad();
            this.Direccion= A.getDireccion();
            this.Productos = B.nombre;
            this.Descripcion = B.descripcion;
            this.Total = B.getPrecio();
        }
        
        public void generafactura(){
        System.out.println("--------------------------------------");
        System.out.println("Informacion de la factura");
        System.out.println("--------------------------------------");
        System.out.println("Fecha: "+this.fecha);
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Edad: "+this.Edad);
        System.out.println("Direccion: "+this.Direccion);
        System.out.println("Productos: "+this.Productos);
        System.out.println("Productos: "+this.Descripcion);
        System.out.println("Total: "+this.Total);
        System.out.println("--------------------------------------");
    }
}
    
   
