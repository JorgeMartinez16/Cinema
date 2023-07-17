
 
package bluckbuster;

import entidades.Pelicula;
import java.text.ParseException;
import java.util.Scanner;
import servicios.ServicioAlquiler;
import servicios.ServicioPelicula;

public class Bluckbuster {

    
    public static void main(String[] args) throws ParseException {
        


        ServicioPelicula sp = new ServicioPelicula();
        ServicioAlquiler sa = new ServicioAlquiler();
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do  {
            System.out.println("Menú de opciones");
            System.out.println("1. crear Pelicula"); //OK
            System.out.println("2. Alquilar Peliculas"); //OK
            System.out.println("3. Listar Peliculas"); //OK
            System.out.println("4. Listar Alquiler"); //OK
            System.out.println("5. Buscar Pelicula por Titulo "); //OK
            System.out.println("6. Buscar Pelicula por Genero "); //OK
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
                    sa.crearAlquiler(sp);
                    break;

                   
                case 3:
                    System.out.println("Has elegido Listar pelicula");
                    sp.ListarPelicula();
                    break;
                case 4:
                    System.out.println("Has elegido Listar alquiler");
                    sa.listarAlquileres();
                    break;
                case 5:

                    System.out.println("Has elegido buscar película por título");
                   
                    sp.BuscarPeliculaTitulo();
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





    