
 
package bluckbuster;

import entidades.Pelicula;
import java.util.Scanner;
import servicios.pelicula.ServicioPelicula;

public class Bluckbuster {

    
    public static void main(String[] args) {
        
//        ServicioPersona sp = new ServicioPersona();
//        Persona p1 = sp.crearPersona();

        ServicioPelicula sp = new ServicioPelicula();
        Pelicula peli = sp.CrearPelicula();
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do  {
            System.out.println("Menú de opciones");
            System.out.println("1. crear Pelicula");
            System.out.println("2. Alquilar Peliculas");
            System.out.println("3. Listar Peliculas");
            System.out.println("4. Listar Alquiler");
            System.out.println("5. Buscar Pelicula por Titulo ");
            System.out.println("6. Buscar Pelicula por Genero ");
            System.out.println("7. Calcular ingreso total");
            System.out.println("8.  Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido crear pelicula.");
                    sp.CrearPelicula();
                    break;
                case 2:
                    System.out.println("Has elegido Alquilar pelicula.");
                    break;
                case 3:
                    System.out.println("Has elegido Listar pelicula");
                    sp.ListarPelicula();
                    break;
                case 4:
                    System.out.println("Has elegido Listar alquiler");
                    
                    break;
                case 5: 
                    System.out.println("Has elegido buscar pelicula por titulo");
                    System.out.println("INGRESE EL TITULO DE LA PELICULA");
                    scanner.nextLine(); //(limpiar el buffer de esa caga)
                    String tituloBusqueda = scanner.nextLine();
                    Pelicula peliculaEncontrada = sp.BuscarPeliculaTitulo(tituloBusqueda);
                    if (peliculaEncontrada != null){
                        System.out.println("LA PELICULA ENCONTRADA ES "+ peliculaEncontrada.getTitulo());
                        
                    } else {
                        System.out.println("NO SE ENCONTRO TU TITULO");
                    }
                    break;
                case 6:
                    System.out.println("Has elegido buscar pelicula por genero");
                    System.out.println("INGRESE EL GENERO DE LA PELICULA");
                    scanner.nextLine(); 
                    String generoBusqueda = scanner.nextLine();
                    Pelicula generoEncontrado = sp.BuscarPeliculaGenero(generoBusqueda);
                    if (generoEncontrado != null){
                        System.out.println("LA PELICULA ENCONTRADA ES "+ generoEncontrado.getTitulo());
                        
                    } else {
                        System.out.println("NO SE ENCONTRO TU TITULO");
                    }
                    break;
                case 7:
                    System.out.println("Has elegido buscar alquiler por fecha");
                    break;
                case 8:
                    System.out.println("Has elegido calcular ingreso total");
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }while ( opcion !=8);
        
    }
    
}
