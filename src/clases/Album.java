package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Album extends Lanzamiento{
    ArrayList<Cancion> canciones = new ArrayList();
    private int numCanciones;

    public Album(int numCanciones, String tituloPublicacion, Date fechaPublicacion, int conteoLikes, int id) {
        super(tituloPublicacion, fechaPublicacion, conteoLikes, id);
        this.numCanciones = numCanciones;
    }

    public Album() {
        super();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }


    @Override
    public String toString() {
        return super.getTituloPublicacion() + " [Numero de Canciones: " + numCanciones + ']' + "[ID: " + super.getId() + ']' + " [Likes: " + super.getConteoLikes() + ']' + "\n"  + canciones;
    }
    
}
