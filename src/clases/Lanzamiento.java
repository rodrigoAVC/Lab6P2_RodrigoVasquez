package clases;

import java.util.Date;

/**
 *
 * @author Rui
 */
public class Lanzamiento {
    private String tituloPublicacion;
    private Date fechaPublicacion;
    private int conteoLikes, id;

    public Lanzamiento(String tituloPublicacion, Date fechaPublicacion, int conteoLikes, int id) {
        this.tituloPublicacion = tituloPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.conteoLikes = conteoLikes;
        this.id = id;
    }

    public Lanzamiento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getTituloPublicacion() {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion) {
        this.tituloPublicacion = tituloPublicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        this.conteoLikes = conteoLikes;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "tituloPublicacion=" + tituloPublicacion + ", fechaPublicacion=" + fechaPublicacion + ", conteoLikes=" + conteoLikes + '}';
    }
    
}
