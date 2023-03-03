package clases;

import java.util.Date;

/**
 *
 * @author Rui
 */
public class Cancion{
    private String titulo, tempDuracion;
    private int id;

    public Cancion(String titulo, String tempDuracion, int id) {
        this.titulo = titulo;
        this.tempDuracion = tempDuracion;
        this.id = id;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTempDuracion() {
        return tempDuracion;
    }

    public void setTempDuracion(String tempDuracion) {
        this.tempDuracion = tempDuracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
