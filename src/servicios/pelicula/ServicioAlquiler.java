/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.pelicula;

import entidades.Alquiler;
import entidades.Pelicula;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ServicioAlquiler {

    private final List<Alquiler> alquileres;

    public ServicioAlquiler() {
        this.alquileres = new ArrayList<>();
    }

    public Alquiler crearAlquiler(ServicioPelicula sp) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del alquiler:");

        Pelicula peliculaAlquilada = sp.BuscarPeliculaTitulo(); // Llamada al método sin argumentos
        if (peliculaAlquilada != null) {
            Date fechaInicio = this.CapturarFecha("Ingrese la fecha de inicio del alquiler (formato dd/MM/yyyy):");
            Date fechaFin = this.CapturarFecha("Ingrese la fecha de fin del alquiler (formato dd/MM/yyyy):");

            System.out.println("Ingrese el precio del alquiler:");
            double precio = scanner.nextDouble();

            Alquiler nuevoAlquiler = new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
            alquileres.add(nuevoAlquiler);
            System.out.println("Alquiler creado exitosamente.");
            return nuevoAlquiler;
        } else {
            System.out.println("No se pudo crear el alquiler. No se encontró una película con ese título.");
            return null;
        }
    }

    private Date CapturarFecha(String titulo) {
        Date fechaValida = null;

        while (fechaValida == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(titulo);
            String fechaInicioStr = scanner.nextLine();
            // Convertir la cadena de fecha a un objeto Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            try {
                fechaValida = dateFormat.parse(fechaInicioStr);
            } catch (ParseException e) {
                System.out.println("Error al analizar la fecha de inicio. Inténtelo nuevamente.");
                fechaValida = null;
            }
        }
        
        return fechaValida;

    }

//    public Alquiler CrearAlquiler(){
//        
//        System.out.println("Ingrese  Nueva Alquiler: \n");
//        
//        Alquiler nuevoAlquiler = new Alquiler(sp.CrearPeliculaPelicula peliculaALquilada, Date fechaInicio, Date fechaFin, double precio);
//        alquileres.add(nuevoAlquiler);
//        System.out.println("Alquiler '" + nuevoAlquiler.getPeliculaAlquilada() + "' creada exitosamente.");
//        return nuevoAlquiler;
//        
//    }  
    public void listarAlquileres() {
        System.out.println("Lista de alquileres:");
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler.toString());
        }
    }

    public Alquiler buscarAlquilerPorFecha(Date fecha) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getFechaInicio().equals(fecha) || alquiler.getFechaFin().equals(fecha)) {
                return alquiler;
            }
        }
        return null;
    }

    public double calcularIngresoTotal() {
        double ingresoTotal = 0;
        for (Alquiler alquiler : alquileres) {
            ingresoTotal += alquiler.getPrecio();
        }
        return ingresoTotal;
    }
}
