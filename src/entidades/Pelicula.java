

package entidades;

import java.util.Date;

public class Pelicula {
    private String titulo;
    private String genero;
    private double lanzamiento;
    private double duracion;

    public Pelicula(String titulo, String genero, double lanzamiento, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Título: " + titulo + ", Género: " + genero + ", Lanzamiento: " + lanzamiento + ", Duración: " + duracion;
    }

    
    
   

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getLanzamiento() {
        return lanzamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String Genero) {
        this.genero = Genero;
    }

    public void setLanzamiento(double lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    
    
}
