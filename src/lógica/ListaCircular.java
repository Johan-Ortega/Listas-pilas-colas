
package lógica;

/**
 * 
 * @author maste
 * @param <T> 
 */
public class ListaCircular<T> {
    private NodoC<T> lc;
    private int tamaño=0;

    public ListaCircular() {
        lc = null;
    }
    
    private boolean listaVacia(){
        if (lc==null){
            return true;
        } else{
            return false;
        }
        
    }
    
    public ListaCircular insertar(T entrada){
        
        NodoC<T> nuevo = new NodoC<>(entrada);
        
        if (listaVacia()){
            lc=nuevo;
            tamaño++;
        }else{
            nuevo.setEnlace(lc.getEnlace());
            lc.setEnlace(nuevo);
            lc = nuevo;
            tamaño++;
        }
        return this;
    }
    
    public NodoC<T> buscarNodo(int index){
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        }else if (index==0){
            return lc.getEnlace();
        }else if (index==getTamaño()-1){
            return lc;
        }else{            
            NodoC<T> buscado = lc.getEnlace();
            
            int contador = 0;
            
            while (contador < index){
                contador++;
                buscado = buscado.getEnlace();
            }
            
            return buscado;
            
        }
        
    }  
    
    public void eliminar(int index){
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return;
        } else{
            NodoC<T> p = buscarNodo(index);
            if (lc==lc.getEnlace()){
                lc = null;
            }else if (p == lc){
                lc=buscarNodo(index-1);
                lc.setEnlace(p.getEnlace());
            }else{
                NodoC<T> nodo_anterior = buscarNodo(index-1);
                nodo_anterior.setEnlace(p.getEnlace());
                p=null;    
            }
            tamaño--;
        }
    }
    
    public T modificar(T elemento, int index){
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        }else{
            NodoC<T> aux = buscarNodo(index);
            
            aux.setDato(elemento);
            
            return aux.getDato();
        }    
    }
    
    public void OrdenarCircularEdad(ListaCircular<Contacto> lista) {
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

    public void OrdenarCircularNombre(ListaCircular<Contacto> lista) {

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
    
    public NodoC<T> getLc(){
        return lc;
    }
}
