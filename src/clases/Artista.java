package clases;

import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class Artista extends Usuario{
    private String nombreArtistico;
    ArrayList<Cancion> canciones = new ArrayList();
    ArrayList<Album> albumes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String nombreArtistico, String username, String password, int edad) {
        super(username, password, edad);
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return nombreArtistico + "\n[Canciones Publicadas: " + canciones + ']' + "\n[Albumes Publicados: " + albumes + ']';
    }
    
}
