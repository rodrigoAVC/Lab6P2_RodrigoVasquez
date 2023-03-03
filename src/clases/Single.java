package clases;

import clases.Cancion;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single(Cancion cancion, String tituloPublicacion, Date fechaPublicacion, int conteoLikes, int id) {
        super(tituloPublicacion, fechaPublicacion, conteoLikes, id);
        this.cancion = cancion;
    }

    public Single() {
        super();
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.getTituloPublicacion() + "[Cancion: " + cancion + ']' + " [Likes: " + super.getConteoLikes() + ']' + "[ID: " + super.getId() + ']';
    }
    
}
