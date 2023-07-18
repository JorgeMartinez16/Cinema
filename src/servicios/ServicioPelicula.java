/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
 
import servicios.CapturarDatos;
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
    
    private final List <Pelicula> peliculas;
    
    public ServicioPelicula() {
        this.peliculas = new ArrayList<>();
    }

    private Scanner leer = new Scanner(System.in);
      
    public Pelicula CrearPelicula(){
        System.out.println("Ingrese  Nueva Pelicula: \n");
        
        String nombre = CapturarDatos.capturarString("Ingrese titulo de la pelicula: ");
        String genero = CapturarDatos.capturarString("Ingrese el Genero de la Pelicula: ");
        double lanzamiento = CapturarDatos.capturarDouble("Ingrese año de lanzamiento: ");
        double duracion = CapturarDatos.capturarDouble("Ingrese duracion: ");
        
        
        Pelicula nuevaPelicula = new Pelicula(nombre, genero, lanzamiento, duracion);
        peliculas.add(nuevaPelicula);
        System.out.println("Pelicula '" + nuevaPelicula.getTitulo() + "' creada exitosamente.");
        return nuevaPelicula;   
    }   
    

    public void ListarPelicula(){
        System.out.println("PELICULAS DISPONIBLES");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
    }
    
    public Pelicula BuscarPeliculaTitulo() {
        
        String tituloBusqueda = CapturarDatos.capturarString("Ingrese titulo de la pelicula: ");

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(tituloBusqueda)) {
                System.out.println("La película encontrada es: " + pelicula.getTitulo());
                return pelicula;
            }
        }
        System.out.println("No se encontró la película con ese título.");
        return null;
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

