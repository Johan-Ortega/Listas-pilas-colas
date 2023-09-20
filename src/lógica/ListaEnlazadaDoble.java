
package lógica;

/**
 * 
 * @author maste
 */
public class ListaEnlazadaDoble<T> {
    private NodoD<T> cabeza;
    private NodoD<T> ultimo;
    private int tamaño=0;

    public ListaEnlazadaDoble() {
        cabeza = null;
    }

    public ListaEnlazadaDoble insertar_final(T entrada) {
        NodoD<T> nuevo = new NodoD<>();
        nuevo.setDato(entrada);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            ultimo.setSig(nuevo);
            nuevo.setAtras(ultimo);
        }
        
        tamaño++;
        ultimo = nuevo;
        return this;
    }

    public ListaEnlazadaDoble insertar_frente(T entrada) {
        NodoD<T> nuevo = new NodoD<>(entrada);
        cabeza.setAtras(nuevo);
        nuevo.setSig(cabeza);
        cabeza = nuevo;
        tamaño++;
        return this;
    }

    public boolean listaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
        
    public NodoD<T> buscarNodo(int index) {
 
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        } else if (index == 0) {
            return cabeza; 
        } else if (index == getTamaño() - 1) {
            return ultimo;
        } else {
 
            NodoD<T> buscado = cabeza;
 
            int contador = 0;
            while (contador < index) {
                contador++;
                buscado = buscado.getSig();
            }
 
            return buscado;
 
        }
 
    }

    public T eliminarPrimero(){
        if (listaVacia()) {
            return null;
        } else {
            T elemento = cabeza.getDato();
 
            NodoD<T> aux = cabeza.getSig();
            cabeza = null; 
            cabeza = aux; 

            if (getTamaño() == 1) {
                ultimo = null;
            }
 
            tamaño--;
 
            return elemento;
 
        }
    }
    
    public T eliminarUltimo() {
 
        if (listaVacia()) {
            return null;
        } else {
            T elemento = ultimo.getDato();
 
            NodoD<T> aux = buscarNodo(getTamaño() - 2);
 
            if (aux == null) {
 
                ultimo = null;
                
                if (getTamaño() == 2) {
                    ultimo = cabeza;
                } else {
                    cabeza = null;
                }
 
            } else {

                ultimo = null;
                ultimo = aux;
                ultimo.setSig(null);
            }
 
            tamaño--;
 
            return elemento;
 
        }
 
    }
    
    public T eliminar(int index) {
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        } else if (index == 0) {
            return eliminarPrimero();
        } else if (index == tamaño - 1) {
            return eliminarUltimo();
        } else {
 
            NodoD<T> nodo_anterior = buscarNodo(index - 1);
 
            NodoD<T> nodo_actual = buscarNodo(index);
            
            T elemento = nodo_actual.getDato();
 
            NodoD<T> nodo_siguiente = nodo_actual.getSig();
            
            nodo_siguiente.setAtras(nodo_anterior);
 
            nodo_actual = null;
 
            nodo_anterior.setSig(nodo_siguiente);
 
            tamaño--;
 
            return elemento;
 
        }
    } 
    
    public T modificar(T elemento, int index) {
 
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        } else {
 
            NodoD<T> aux = buscarNodo(index);
 
            aux.setDato(elemento);
 
            return aux.getDato();
        
        }
 
    }
    
    public NodoD<T> getCabeza(){
        return cabeza;
    }
    
    public NodoD<T> getUltimo(){
        return ultimo;
    }
    
    
    
    public void OrdenarEnlazadaDobleEdad(ListaEnlazadaDoble<Contacto> lista) {
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

    public void OrdenarEnlazadaDobleNombre(ListaEnlazadaDoble<Contacto> lista) {
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
}

