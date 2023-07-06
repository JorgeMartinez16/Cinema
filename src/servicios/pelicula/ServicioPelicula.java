/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.pelicula;
 
import entidades.Alquiler;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER1
 */
public class ServicioPelicula {
    
    private List <Pelicula> peliculas;

    public ServicioPelicula() {
        this.peliculas = new ArrayList<>();
    }

    
    private Scanner leer = new Scanner(System.in);
      
    public Pelicula CrearPelicula(){
        
        System.out.println("Ingrese  Nueva Pelicula: \n");
        
        System.out.println("Ingrese nombre de la pelicula: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese Genero ");
        String genero = leer.nextLine();
        System.out.println("Ingrese año de lanzamiento");
        double lanzamiento = leer.nextDouble();
        System.out.println("Ingrese duracion: ");
        double duracion = leer.nextDouble();
        leer.nextLine();
        
        Pelicula nuevaPelicula = new Pelicula(nombre, genero, lanzamiento, duracion);
        peliculas.add(nuevaPelicula);
        return nuevaPelicula;
    }   
    
    
    
    public void ListarPelicula(){
        System.out.println("Lista de Peliculas");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.toString());
        }
    }
    
    
//    public Pelicula BuscarPeliculaTitulo1(String titulo){
//        for (Pelicula pelicula : peliculas){
//            if(pelicula.getTitulo().equalsIgnoreCase(titulo)){
//                System.out.println("la pelicula si existe, es: " + pelicula);
//            }
//                
//        }
//        return null;
//    }
    
    public Pelicula BuscarPeliculaTitulo(String titulo) {
    for (Pelicula pelicula : peliculas) {
        if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
            return pelicula; // Retorna la película encontrada
        }
    }
    return null; // Si no se encuentra la película, retorna null
}

    
    
      public Pelicula BuscarPeliculaGenero(String genero){
        for (Pelicula pelicula : peliculas){
            if(pelicula.getGenero().equalsIgnoreCase(genero)){
                return pelicula;
            }
                
        }
        return null;
    }
}

