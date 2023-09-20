
package lógica;

/**
 * 
 * @author maste
 */
public class ListaEnlazada<T> {
    private Nodo<T> cabeza;
    private Nodo<T> anterior;
    private int tamaño=0;

    public ListaEnlazada() {
        cabeza = null;
    }

    public ListaEnlazada insertar_final(T entrada) {
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setDato(entrada);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            anterior.setSig(nuevo);
        }
        
        tamaño++;
        anterior = nuevo;
        return this;
    }

    public ListaEnlazada insertar_frente(T entrada) {
        Nodo<T> nuevo = new Nodo<>(entrada);
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
        
    public Nodo<T> getNodo(int index) {
 
        if (listaVacia() || (index < 0 || index >= getTamaño())) {
            return null;
        } else if (index == 0) {
            return cabeza; 
        } else if (index == getTamaño() - 1) {
            return anterior;
        } else {
 
            Nodo<T> buscado = cabeza;
 
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
 
            Nodo<T> aux = cabeza.getSig();
            cabeza = null; 
            cabeza = aux; 

            if (getTamaño() == 1) {
                anterior = null;
            }
 
            tamaño--;
 
            return elemento;
 
        }
    }
    
    public T eliminarUltimo() {
 
        if (listaVacia()) {
            return null;
        } else {
            T elemento = anterior.getDato();
 
            Nodo<T> aux = getNodo(getTamaño() - 2);
 
            if (aux == null) {
 
                anterior = null;
                
                if (getTamaño() == 2) {
                    anterior = cabeza;
                } else {
                    cabeza = null;
                }
 
            } else {

                anterior = null;
                anterior = aux;
                anterior.setSig(null);
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
 
            Nodo<T> nodo_anterior = getNodo(index - 1);
 
            Nodo<T> nodo_actual = getNodo(index);
 
            T elemento = nodo_actual.getDato();
 
            Nodo<T> nodo_siguiente = nodo_actual.getSig();
 
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
 
            Nodo<T> aux = getNodo(index);
 
            aux.setDato(elemento);
 
            return aux.getDato();
        
        }
 
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }
    
        
    public void OrdenarEnlazadaEdad(ListaEnlazada<Contacto> lista) {
        for (int i = 0; i < (lista.getTamaño() - 1); i++) {
            for (int j = i + 1; j < lista.getTamaño(); j++) {
                if (lista.getNodo(i).getDato().getEdad() > lista.getNodo(j).getDato().getEdad()) {
                    Contacto variableauxiliar = lista.getNodo(i).getDato();
                    lista.getNodo(i).setDato(lista.getNodo(j).getDato());
                    lista.getNodo(j).setDato(variableauxiliar);
                }
            }
        }
    }

    public void OrdenarEnlazadaNombre(ListaEnlazada<Contacto> lista) {

        for (int i = 0; i < (lista.getTamaño() - 1); i++) {
            for (int j = i + 1; j < lista.getTamaño(); j++) {
                if (lista.getNodo(i).getDato().getNombre().compareToIgnoreCase(lista.getNodo(j).getDato().getNombre()) > 0) {
                    Contacto variableauxiliar = lista.getNodo(i).getDato();
                    lista.getNodo(i).setDato(lista.getNodo(j).getDato());
                    lista.getNodo(j).setDato(variableauxiliar);

                }
            }
        }
    }

    
    public int getTamaño(){
        return tamaño;
    }

}

