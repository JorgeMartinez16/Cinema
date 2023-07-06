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

public class ServicioAlquiler {
    private List <Alquiler> alquileres;

    public ServicioAlquiler() {
        this.alquileres = new ArrayList<>();
    }

    
    
    public void crearAlquiler(Pelicula peliculaAlquilada, Date fechaInicio, Date fechaFin, double precio ) {
        Alquiler alquiler = new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
        alquileres.add(alquiler);
        System.out.println("Alquiler creado exitosamente.");
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
