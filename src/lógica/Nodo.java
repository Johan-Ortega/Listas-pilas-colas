
package lógica;

/**
 * 
 * @author maste
 * @param <T> 
 */
public class Nodo<T> {
    private Nodo<T> sig;
    private T dato;
    
    public Nodo(){
        setSig(null);
    }
    
    public Nodo(T dato) {
        this.dato = dato;
        setSig(null);
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    
    
    
}
