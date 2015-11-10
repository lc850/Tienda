

package tiendaonline;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dracke
 */
public class Factura{

    java.util.Date fecha = new Date();
    String nombre;
    int edad;
    String direccion;
    ArrayList<Producto> productos;
    
    
    
        public Factura(int Fecha,Cliente A, ArrayList<Producto> productos ){
            
            this.fecha = fecha;
            this.nombre= A.getNombre();
            this.edad= A.getEdad();
            this.direccion= A.getDireccion();
            this.productos = productos;
        }
        
        public void generafactura(){
            // entonces aquì, ocuparian poner un ciclo recorriendo los productos e imprimir su informaciòn
            // como mas les guste
        System.out.println("--------------------------------------");
        System.out.println("Informacion de la factura");
        System.out.println("--------------------------------------");
        System.out.println("Fecha: "+this.fecha);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Direccion: "+this.direccion);
        double total_global = 0;
        for (Producto p : productos) {
            System.out.println("Productos: "+p.nombre);
            System.out.println("Productos: "+p.descripcion);
            total_global += p.getPrecio();
        }
        
        System.out.println("Total: "+ total_global);
        System.out.println("--------------------------------------");
    }
}
    
   
