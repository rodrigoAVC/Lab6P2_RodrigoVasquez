package clases;

import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class ListaReproduccion {
    private String nombre, creador;
    private int contLikes;
    ArrayList<Cancion> canciones = new ArrayList();

    public ListaReproduccion() {
    }

    public ListaReproduccion(String nombre, String creador, int contLikes) {
        this.nombre = nombre;
        this.creador = creador;
        this.contLikes = contLikes;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContLikes() {
        return contLikes;
    }

    public void setContLikes(int contLikes) {
        this.contLikes = contLikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "\n" + nombre + "[Likes: " + contLikes + "] [Canciones: " + canciones + ']' + "[Creador: " + creador + ']';
    }
    
}
