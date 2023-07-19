/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
 
import servicios.CapturarDatos;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER1
 */
public class ServicioPelicula {
    
    /**
     * Busca películas por su género en la lista de películas.
     * Imprime la información de las películas encontradas si se encuentran.
     * @return Una lista de películas encontradas con el género especificado.
     */
    
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
        ArrayList<Pelicula> peliculasEncontradas = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(tituloBusqueda)) {
                System.out.println("La película encontrada es: " + pelicula.getTitulo());
                return pelicula;
            } else {
                peliculasEncontradas.add(pelicula);
            }
        }

        System.out.println("Películas encontradas con el título '" + tituloBusqueda + "':");
        for (Pelicula peliculaEncontrada : peliculasEncontradas) {
            System.out.println("Título: " + peliculaEncontrada.getTitulo());
            System.out.println("Género: " + peliculaEncontrada.getGenero());
            System.out.println("Año de lanzamiento: " + peliculaEncontrada.getLanzamiento());
            System.out.println("Duración: " + peliculaEncontrada.getDuracion());
            System.out.println("---------------------------");
        }
        System.out.println("No se encontró la película con ese título.");
        return null;
    }
    
    public List<Pelicula> buscarPeliculasPorGenero() {
        String generoBusqueda = CapturarDatos.capturarString("Ingrese género de la película: ");

        ArrayList<Pelicula> peliculasEncontradas = new ArrayList<>();

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(generoBusqueda)) {
                peliculasEncontradas.add(pelicula);
            }
        }

        if (peliculasEncontradas.isEmpty()) {
            System.out.println("No hay películas con ese género.");
        } else {
            System.out.println("Películas encontradas con el género '" + generoBusqueda + "':");
            for (Pelicula peliculaEncontrada : peliculasEncontradas) {
                System.out.println("Título: " + peliculaEncontrada.getTitulo());
                System.out.println("Género: " + peliculaEncontrada.getGenero());
                System.out.println("Año de lanzamiento: " + peliculaEncontrada.getLanzamiento());
                System.out.println("Duración: " + peliculaEncontrada.getDuracion());
                System.out.println("---------------------------");
            }
        }

        return peliculasEncontradas;
    }


    
      
    }
