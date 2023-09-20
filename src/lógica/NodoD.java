
package lógica;

/**
 * 
 * @author maste
 * @param <T> 
 */
public class NodoD<T> {
    private NodoD<T> sig;
    private NodoD<T> atras;
    private T dato;
    
    public NodoD(){
        setSig(null);
        setAtras(null);
    }
    
    public NodoD(T dato) {
        this.dato = dato;
        sig=atras=null;
    }

    public NodoD<T> getSig() {
        return sig;
    }

    public void setSig(NodoD<T> sig) {
        this.sig = sig;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoD<T> getAtras() {
        return atras;
    }

    public void setAtras(NodoD<T> atras) {
        this.atras = atras;
    }

    
}
