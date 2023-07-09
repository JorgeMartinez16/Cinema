
 
package bluckbuster;

import entidades.Pelicula;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import servicios.pelicula.ServicioAlquiler;
import servicios.pelicula.ServicioPelicula;

public class Bluckbuster {

    
    public static void main(String[] args) throws ParseException {
        


        ServicioPelicula sp = new ServicioPelicula();
        ServicioAlquiler sa = new ServicioAlquiler();
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do  {
            System.out.println("Menú de opciones");
            System.out.println("1. crear Pelicula"); //OK
            System.out.println("2. Alquilar Peliculas");
            System.out.println("3. Listar Peliculas"); //OK
            System.out.println("4. Listar Alquiler");
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
                    System.out.println("Ingrese los datos del alquiler:");

                   
                    scanner.nextLine(); 
                    System.out.println("Ingrese el título de la película:");
                    String tituloPelicula = scanner.nextLine();
                  
                    Pelicula peliculaAlquilada = sp.BuscarPeliculaTitulo(tituloPelicula);
                    if (peliculaAlquilada != null) {
                        System.out.println("Ingrese la fecha de inicio del alquiler (formato dd/MM/yyyy):");
                        String fechaInicioStr = scanner.nextLine();
                        //___ Convertir la cadena de fecha a un objeto Date
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date fechaInicio = dateFormat.parse(fechaInicioStr); 
                        System.out.println("Ingrese la fecha de fin del alquiler (formato dd/MM/yyyy):");
                        String fechaFinStr = scanner.nextLine();
                        // ___Convertir la cadena de fecha a un objeto Date
                        Date fechaFin = dateFormat.parse(fechaFinStr);
                        System.out.println("Ingrese el precio del alquiler:");
                        double precio = scanner.nextDouble();

                        sa.crearAlquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
                        
                    } else {
                        System.out.println("No se encontró una película con ese título.");
                    }
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





    