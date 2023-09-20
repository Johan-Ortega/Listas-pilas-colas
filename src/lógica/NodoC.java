
package lógica;

/**
 * 
 * @author maste
 * @param <T> 
 */
public class NodoC<T> {
    private T dato;
    private NodoC<T> enlace;

    public NodoC() {
        enlace = this;
    }

    public NodoC(T dato) {
        this.dato = dato;
        this.enlace = this;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoC<T> getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoC<T> enlace) {
        this.enlace = enlace;
    }
    
    
    
}
