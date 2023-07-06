

package entidades;

import java.util.Date;

public class Pelicula {
    private String titulo;
    private String Genero;
    private double lanzamiento;
    private double duracion;

    public Pelicula(String titulo, String Genero, double lanzamiento, double duracion) {
        this.titulo = titulo;
        this.Genero = Genero;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
    }

   

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return Genero;
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
        this.Genero = Genero;
    }

    public void setLanzamiento(double lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    
    
}
