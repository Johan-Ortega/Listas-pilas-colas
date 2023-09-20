
package lógica;

/**
 * 
 * @author maste
 * @param <T> 
 */
public class NodoCD<T> {
    private T dato;
    private NodoCD<T> anterior;
    private NodoCD<T> siguiente;

    public NodoCD() {
        anterior=this;
        siguiente=this;
    }

    public NodoCD(T dato) {
        this.dato = dato;
        this.anterior = this;
        this.siguiente = this;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoCD<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCD<T> anterior) {
        this.anterior = anterior;
    }

    public NodoCD<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCD<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
    
}
