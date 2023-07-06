/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;


public class Alquiler {
    private Pelicula PeliculaAlquilada;
    private Date FechaInicio;
    private Date FechaFin;
    private double Precio;

  public Alquiler(Pelicula PeliculaAlquilada, Date FechaInicio, Date FechaFin, double Precio) {
        this.PeliculaAlquilada = PeliculaAlquilada;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Precio = Precio;
    }

    public void setPeliculaAlquilada(Pelicula PeliculaAlquilada) {
        this.PeliculaAlquilada = PeliculaAlquilada;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Pelicula getPeliculaAlquilada() {
        return PeliculaAlquilada;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public double getPrecio() {
        return Precio;
    }

   
    
    
    
    
}
