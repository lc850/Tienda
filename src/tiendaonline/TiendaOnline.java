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
        Cliente cliente = new Cliente("Homero", 40, "Calle Falsa 123");
        cliente.consultarDireccion();
        Cliente cliente2 = new Cliente("Alain", 26, "Por ahi");
        cliente2.consultarDireccion();
        Cliente cliente3 = new Cliente("Dracke-Sempai", 25, "En otro lado");
        cliente3.consultarDireccion();
        Cliente cliente4 = new Cliente("El Garza", 23, "En su casa");
        cliente4.consultarDireccion();
        Cliente cliente5 = new Cliente("Pablito", 23, "Con el garza");
        cliente5.consultarDireccion();
        System.out.println("Cliente");
    }
    
}
