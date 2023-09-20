
package lógica;

/**
 * 
 * @author maste
 */
public class ListaCircularDoble<T> {
    private NodoCD<T> lc;
    private int tamaño=0;

    public ListaCircularDoble() {
        lc = null;
    }
    
    private boolean listaVacia(){
        if (lc==null){
            return true;
        } else{
            return false;
        }
        
    }
    
    public ListaCircularDoble insertar(T entrada){
        
        NodoCD<T> nuevo = new NodoCD<>(entrada);
        
        if (listaVacia()){
            lc=nuevo;
            tamaño++;
        }else{
            nuevo.setSiguiente(lc.getSiguiente());
            lc.getSiguiente().setAnterior(nuevo);
            nuevo.setAnterior(lc);
            lc.setSiguiente(nuevo);
            lc=nuevo;
            tamaño++;
        }
            
        return this;
    }
    
    public NodoCD<T> buscarNodo(int index){
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        }else if (index==0){
            return lc.getSiguiente();
        }else if (index==getTamaño()-1){
            return lc;
        }else{            
            NodoCD<T> buscado = lc.getSiguiente();
            
            int contador = 0;
            
            while (contador < index){
                contador++;
                buscado = buscado.getSiguiente();
            }
            
            return buscado;
            
        }
        
    }  
    
    public void eliminar(int index){
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return;
        } else{
            NodoCD<T> p = buscarNodo(index);
            if (lc==lc.getSiguiente()){
                lc = null;
            }else if (p == lc){
                lc=buscarNodo(index-1);
                p.getSiguiente().setAnterior(lc);
                lc.setSiguiente(p.getSiguiente());
            }else{
                p.getAnterior().setSiguiente(p.getSiguiente());
                p.getSiguiente().setAnterior(p.getAnterior());
            }
            p=null;
            tamaño--;
        }
    }
    
    public T modificar(T elemento, int index){
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        }else{
            NodoCD<T> aux = buscarNodo(index);
            
            aux.setDato(elemento);
            
            return aux.getDato();
        }    
    }
    
      public void OrdenarCircularDobleEdad(ListaCircularDoble<Contacto> lista) {
        for (int i = 0; i < (lista.getTamaño() - 1); i++) {
            for (int j = i + 1; j < lista.getTamaño(); j++) {
                if (lista.buscarNodo(i).getDato().getEdad() > lista.buscarNodo(j).getDato().getEdad()) {
                    Contacto variableauxiliar = lista.buscarNodo(i).getDato();
                    lista.buscarNodo(i).setDato(lista.buscarNodo(j).getDato());
                    lista.buscarNodo(j).setDato(variableauxiliar);
                }
            }
        }
    }

    public void OrdenarCircularDobleNombre(ListaCircularDoble<Contacto> lista) {

        for (int i = 0; i < (lista.getTamaño() - 1); i++) {
            for (int j = i + 1; j < lista.getTamaño(); j++) {
                if (lista.buscarNodo(i).getDato().getNombre().compareToIgnoreCase(lista.buscarNodo(j).getDato().getNombre()) > 0) {
                    Contacto variableauxiliar = lista.buscarNodo(i).getDato();
                    lista.buscarNodo(i).setDato(lista.buscarNodo(j).getDato());
                    lista.buscarNodo(j).setDato(variableauxiliar);

                }
            }
        }
    }
    
     public int getTamaño(){
        return tamaño;
    }
    
    public NodoCD<T> getLc(){
        return lc;
    }
    
}
