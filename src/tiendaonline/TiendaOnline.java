/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiendaonline;

import java.util.ArrayList;

/**
 *
 * @author lclap
 */
public class TiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Producto> producto = new ArrayList<Producto>();
    public static void main(String[] args) {     
        Producto libro=new Producto("UML y Patrones", 200.00, 4, "Libro de UML");
        producto.add(libro);
        
        for (Producto p : producto) {
			System.out.print("Nombre: "+p.nombre+"-->");
		}
        
        /*libro.consultarProducto();
        Producto celular=new Producto("Iphone 6", 15000.00, 8, "Celular de ultima generacion Apple");
        celular.consultarProducto();
        Producto comic=new Producto("One-punch-man", 70.00, 12, "Comic Extranjero");
        comic.consultarProducto();
        Producto instrumento=new Producto("Fender Stratocaster:Dave Murray '59 signature ", 25000.00, 2, "Guitarra Electrica");
        instrumento.consultarProducto();
        Producto libro2=new Producto("Defensa Aerea Rusa ", 500.00, 8, "Libro sobre tacticas aereas");
        libro2.consultarProducto();
        Producto juego=new Producto(" Assasin Creed 7", 500.00, 8, "Sequela de Assasin Creed...");
        juego.consultarProducto();
        System.out.println("Productos");
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
        Cliente cliente6 = new Cliente("Juanpi", 23, "Calle Onechan 3801 Colonia Nep");
        cliente6.consultarDireccion();
        System.out.println("Cliente");
        Factura factura= new Factura(12031998,cliente,libro);
        factura.generafactura();
        Factura factura2= new Factura(11041991,cliente2,celular);
        factura2.generafactura();
        Factura factura3= new Factura(22072000,cliente3,comic);
        factura3.generafactura();
        Factura factura4= new Factura(1041991,cliente4,instrumento);
        factura4.generafactura();
        Factura factura5= new Factura(9011998,cliente5,libro2);
        factura5.generafactura();
        Factura factura6= new Factura(3121999,cliente6,juego);
        factura6.generafactura();
        System.out.println("Factura");*/
        
        
    }
    
}
