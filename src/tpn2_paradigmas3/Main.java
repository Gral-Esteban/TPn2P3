/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn2_paradigmas3;

import TPn2_objects.Cliente;
import TPn2_objects.Pelicula;
import TPn2_objects.Socio;
import TPn2_objects.Tarjeta;
import TPn2_objects.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Esteban DAlbano
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereCliente cliente1;
        Tarjeta tarjeta1;
       Pelicula pelicula1,pelicula2;
        
        Cliente cliente1 = new Cliente(0,31591318,"Esteban","Dalbano");
         Cliente cliente2 = new Cliente(0,40591318,"Flor","Bazan");
         Usuario usuario1 = new Usuario(0,20345677,"Fefe","Luna");
         Socio socio1= new Socio(12,29899324,"Maxi","Brizu");
         tarjeta1= new Tarjeta();
         
         //carga de las peliculas
         pelicula1=new Pelicula(0,"Kill Bill","Suspenso",320,true);
         pelicula2=new Pelicula(0,"Transformers","Ciencia Ficcion",420,true);
        
        var peliculas = new ArrayList<String>();
        peliculas.add(pelicula1.getNombre());
         peliculas.add(pelicula2.getNombre());
        
        
        
         var clientes = new ArrayList<String>();
         clientes.add(0,cliente2.getApellido());
         clientes.add(1,usuario1.getApellido());
         clientes.add(2,socio1.getApellido());
       
        
        System.out.println(cliente1);
        System.out.println(cliente2);
         System.out.println(usuario1);
        System.out.println(socio1);
        System.out.println("saldo:"+tarjeta1.mostrar_saldo());
        System.out.println(clientes.get(2));
        System.out.println(peliculas.get(0));
        System.out.println(peliculas.get(1));
        
    }
    
}
