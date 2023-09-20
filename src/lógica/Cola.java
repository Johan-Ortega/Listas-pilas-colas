
package lógica;

/**
 * 
 * @author maste
 * @param <T> 
 */
public class Cola<T> {
    protected Nodo<T> frente;
    protected Nodo<T> fin;

    public Cola() {
        frente = fin = null;
    }

    public void insertar(Object elemento) {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.setSig(a);
        }
        fin = a;
    }

    public T quitar() {
        T aux;
        if (!colaVacia()) {
            aux = frente.getDato();
            frente = frente.getSig();
        } else {
            return null;
        }
        return aux;
    }

    public void borrarCola() {
        Nodo A;
        for (; frente != null;) {
            A = frente;
            frente = frente.getSig();
            A.setSig(null);
        }
        System.gc();
    }

    public T frenteCola() {
        if (colaVacia()) {
            return null;
        }
        return (frente.getDato());
    }

    public boolean colaVacia() {
        return (frente == null);
    }
}
