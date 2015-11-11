/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;
/**
 *
 * @author Juampi
 */
public class Cliente {
    String nombre;
    int edad;
    String direccion;
    String email;
        public Cliente(String nombre,int edad,String direccion ){
            this.nombre = nombre;
            this.edad = edad;
            this.direccion = direccion;
            this.email = email;
        }
        public void consultarDireccion(){
            System.out.println("Información del Cliente");
            System.out.println("--------------------------------------");
            System.out.println("Nombre: "+this.nombre);
            System.out.println("Edad: "+this.edad+" Años");
            System.out.println("Direccion: "+this.direccion);
            System.out.println("Email: "+this.email);
            System.out.println("--------------------------------------");
        }
         public String getNombre(){
        	return nombre;
        }
        public int getEdad(){
        	return edad;
        }
        public String getDireccion(){
        	return direccion;
        }
        public String getEmail(){
            return email;
        }
           
}