package lógica;



/**
 * 
 * @author maste
 * @param <T> 
 */
public class Pila<T> {
    private Nodo<T> cima;
    
    public Pila(){
        cima = null;
    }
    
    public boolean pilaVacia(){
        if (cima==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertar(T elemento){
        Nodo<T> nuevo;
        nuevo = new Nodo<>(elemento);
        nuevo.setSig(cima);
        cima = nuevo;
    }
    
    public T quitar() {
        if (pilaVacia()) {
            return null;
        }
        T aux = cima.getDato();
        cima = cima.getSig();
        return aux;
    }
    
    public void limpiarPila() {
        Nodo<T> t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.getSig();
            t.setSig(null);
        }
    }
    
    public T cimaPila(){
        if (pilaVacia()){
            return null;
        }
        return (cima.getDato());
    }
    
}
