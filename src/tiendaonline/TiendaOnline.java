package tiendaonline;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lclap
 */
public class TiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Producto> producto = new ArrayList<Producto>();
    public static ArrayList<Producto> productos_elegidos = new ArrayList<Producto>();
    public static Cliente cliente;

    public static void main(String[] args) {
        menu();
    }

    public static void ComprarProducto() {
        // aqui un cliente.....
        cliente = new Cliente("Homero", 40, "Calle Falsa 123");

        // aqui se pondrian todos los productos en la lista
        producto.add(new Producto("UML y Patrones", 200.00, 4, "Libro de UML"));
        producto.add(new Producto("Iphone 6", 15000.00, 8, "Celular de ultima generacion Apple"));

        for (int i = 0; i < producto.size(); i++) {
            // aqui mostramos la informacion usando la lista
            System.out.println("Producto: " + (i + 1));
            producto.get(i).consultarProducto();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea la opcion:");

        int opcion = sc.nextInt();
        while (opcion != 0) {
            // por seguridad..
            if (opcion > producto.size()) {
                System.out.println("Esa opcion nisiquiera existe, intente de nuevo");
                opcion = sc.nextInt();
                continue; // te manda al inicio del ciclo, de aqui salta al while de nuevo sin pasar abajo
            }

            productos_elegidos.add(producto.get(opcion - 1));
            System.out.println("Seleccionado el producto " + producto.get(opcion - 1).nombre);
            System.out.println("Seleccione otro producto o 0 para finalizar");
            opcion = sc.nextInt();
        }

        /*
        Producto comic = new Producto("One-punch-man", 70.00, 12, "Comic Extranjero");
        comic.consultarProducto();
        Producto instrumento = new Producto("Fender Stratocaster:Dave Murray '59 signature ", 25000.00, 2, "Guitarra Electrica");
        instrumento.consultarProducto();
        Producto libro2 = new Producto("Defensa Aerea Rusa ", 500.00, 8, "Libro sobre tacticas aereas");
        libro2.consultarProducto();
        Producto juego = new Producto(" Assasin Creed 7", 500.00, 8, "Sequela de Assasin Creed...");
        juego.consultarProducto();
        System.out.println("Productos"); // <-- y esto? 
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
         */
        // que rara forma de mandar la fecha, java.util.Date fecha = new Date(); asi tiene mas sentido
        // asi nomas se genera un objeto factura, se madna la lista y se genera todo.
        System.out.println("Fin de la compra");
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        int opcion_leida = -1;
        while (opcion_leida != 0) {

            System.out.println(":::::::::::::::::MENÚ:::::::::::::::::");
            System.out.println("======================================");
            System.out.println(">Opciones:");
            System.out.println("1.-Comprar");
            System.out.println("2.-Facturar");
            System.out.println("0.-Salir");

            System.out.println("======================================");
            System.out.println("Teclee la opción deseada:");
            opcion_leida = leer.nextInt();

            switch (opcion_leida) {
                case 1:
                    ComprarProducto();
                    break;
                case 2:
                    if (cliente != null) {
                        Factura factura = new Factura(12031998, cliente, productos_elegidos);
                        factura.generafactura();
                    }
                    break;
            }

        }
    }
}
