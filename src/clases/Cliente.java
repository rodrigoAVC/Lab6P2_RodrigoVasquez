package clases;

import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class Cliente extends Usuario{
    ArrayList<Cancion> cancionesFavoritas = new ArrayList();
    ArrayList<ListaReproduccion> listas_de_reproduccion = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(String username, String password, int edad) {
        super(username, password, edad);
    }

    public ArrayList<Cancion> getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(ArrayList<Cancion> cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public ArrayList<ListaReproduccion> getListas_de_reproduccion() {
        return listas_de_reproduccion;
    }

    public void setListas_de_reproduccion(ArrayList<ListaReproduccion> listas_de_reproduccion) {
        this.listas_de_reproduccion = listas_de_reproduccion;
    }

    @Override
    public String toString() {
        return super.getUsername() + "\n[Canciones Favoritas: " + cancionesFavoritas + ']' + "\n[Listas de Reproduccion: " + listas_de_reproduccion + ']';
    }
    
    
}
