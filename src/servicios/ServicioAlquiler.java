/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

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

        System.out.println("Ingrese los datos del alquiler:");

        Pelicula peliculaAlquilada = sp.BuscarPeliculaTitulo(); 
        if (peliculaAlquilada != null) {
            Date fechaInicio = CapturarDatos.capturarFecha("Ingrese la fecha de inicio del alquiler (formato dd/MM/yyyy):");
            Date fechaFin = CapturarDatos.capturarFecha("Ingrese la fecha de fin del alquiler (formato dd/MM/yyyy):");
            
            double precio = CapturarDatos.capturarDouble("Ingrese el precio del alquiler: ");

            Alquiler nuevoAlquiler = new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
            alquileres.add(nuevoAlquiler);
            System.out.println("Alquiler creado exitosamente.");
            return nuevoAlquiler;
        } else {
            System.out.println("No se pudo crear el alquiler. No se encontró una película con ese título.");
            return null;
        }
    }


 
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
