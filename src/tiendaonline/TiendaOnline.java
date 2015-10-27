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
public class TiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto libro=new Producto("UML y Patrones", 200.00, 4, "Libro de UML");
        libro.consultarProducto();
        System.out.println("Prueba de GIT con NetBeans");
    }
    
}
