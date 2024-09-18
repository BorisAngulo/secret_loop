
package Modelo;

/**
 *
 * @author boris
 * @param <T>
 */
public class ListaSE<T> implements Lista<T>{
    private T ini;
    private ListaSE<T> sig;
    /**
     * construye una ListaSE vacia.
     */
    public ListaSE(){
        ini = null;
        sig = null;
    }

    /**
     * metodo vacia que retorna true si la lista esta vacia, false si no lo esta.
     * @return 
     */
    @Override
    public boolean vacia(){
        return ini == null; 
    }

    /**
     * metodo insertar permite insertar el dato al final de la lista
     * @param dato dato que se insertara en la lista.
     */
    @Override
    public void insertar(T dato){
        if(vacia()){
            ini = dato;
            sig = new ListaSE<>();
        }
        else{
            sig.insertar(dato);
        }
    }

    /**
     * metodo eliminar permite eliminar un dato de la lista si existiera
     * Y devuelve el dato eliminado, en caso de no haber la posicion
     * no se altera la lista.
     * @param index posicion de la lista que se eliminara.
     * @return 
     */
    @Override
    public T eliminar(int index){
        T res;
        if(vacia()){
            res = null;
        }
        else{
            if(index == 0){
                res = ini;
                ini = sig.ini;
                sig = sig.sig;
            }else{
                res = sig.eliminar(index - 1);
            }
        }
        return res;
    }

    /**
     * metodo acceder permite acceder a un dato de la lista.
     * @param index posicion de la lista al que se accedera.
     * @return 
     */
    @Override
    public T acceder(int index){
        T res;
        if(vacia()){
            res = null;
        }
        else{
            if(index == 0){
                res = ini;
            }
            else{
                res = sig.acceder(index -1);
            }
        }
        return res;
    }
    
    /**
     * metodo que devuelve el numero de datos que almacena la estructura
     * @return 
     */
    @Override
    public int longitud(){
        int longitud;
        if(vacia()){
            longitud = 0;
        }else{
            longitud = 1 + sig.longitud();
        }
        return longitud;
    }
    
    /**
     * metodo que inserta un dato en la posicion.
     * @param dato dato que se insertara en una posicion dada.
     * @param index posicion en la que se insertara el dato
     * @return 
     */
    @Override
    public boolean insertar(T dato, int index){
        boolean res;
        if(vacia()){
            if(index == 0){
                ini = dato;
                sig = new ListaSE<>();
                res = true;
            }else{
                res = false;
            }
        }else{
            if(index == 0){
                sig.insertar(ini, 0);
                ini = dato;
                res = true;
            }else{
                res = sig.insertar(dato, index - 1);
            }
        }
        return res;
    }
    
    /**
     * metodo que devuelve true si el dato pertenece a la estructura, caso 
     * contrario lo devuelve false
     * @param dato dato que veremos si existe o no en la lista
     * @return 
     */
    @Override
    public boolean buscar(T dato){
        boolean esta;
        if(vacia()){
            esta = false;
        }else{
            if(ini.equals(dato)){
                esta = true;
            }else{
                esta = sig.buscar(dato);
            }
        }
        return esta;
    }
    
    /**
     * metodo que devuelve la posicion del dato si es que este pertenece a la
     * estructura, caso contrario devuelve -1.
     * @param dato dato que mostrara en que posicion se encuentra
     * @return 
     */
    @Override
    public int indiceDe(T dato){
        int pos;
        if(vacia()){
            pos = -1;
        }else{
            if(dato.equals(ini)){
                pos = 0;
            }else{
                pos = sig.indiceDe(dato);
                if(pos != -1){
                    pos ++;
                }
            }
        }
        return pos;
    }
    
    /**
     * metodo que devuelve la posicion de la primera instancia en la que radica
     * el dato a partir de la posicion pos, en caso de existir, caso contrario
     * devuelve -1
     * @param dato que deseamos saber el índice.
     * @param desde posición inicial que buscaremos.
     * @return 
     */
    @Override
    public int indiceDe(T dato, int desde){
        return indiceDe(dato, desde, desde);
    }
    
    private int indiceDe(T dato, int desde, int incr){
        int pos;
        if(vacia()){
            pos = -1;
        }else{
            if(desde == 0){
                pos = indiceDe(dato);
                if(pos != -1){
                    pos = pos + incr;
                }
            }else{
                pos = sig.indiceDe(dato, desde - 1, incr);
            }
        }
        return pos;
    }
    
    /**
     * metodo permite serializar en una cadena a los datos de la estructura
     */
    @Override
    public String toString(){
        return null;
    }
    
    /**
     * metodo que permite insertar todos los datos de la otra lista en esta.
     * @param otra lista a la que insertaremos
     */
    @Override
    public void insertarTodos(Lista<T> otra){
    }
    
    /**
     * metodo que permite clonar la estructura
     * @return 
     */
    @Override
    public Lista<T> clonar(){
        return null;
    }
    
    /**
     * metodo que permite vaciar la lista.
     */
    @Override
    public void limpiar(){
        if(!vacia()){
            ini = null;
            sig = null;
        }
    }
    
    /**
     * metodo que permite eliminar el primer elemento de la lista.
     * @return 
     */
    @Override
    public T eliminarIni(){
        return null;
    }
    
    /**
     *metodo que permite elimiar el ultimo elemento de la lista. 
     * @return 
     */
    @Override
    public T elimiarUlt(){
        return null;
    }
    
    /**
     * metodo que permite cambiar el dato de la posicion index si es que existiera
     * @param dato dato que colocaremos en el de la pos.
     * @param index
     */
    @Override
    public void setDato(T dato, int index){
        if(!vacia()){
            if(index == 0){
                ini = dato;
            }else{
                sig.setDato(dato, index - 1);
            }
        }
        
    }
    
    /**
     * metodo que verifica si el contenido de la lista con la otra son iguales.
     * @param otra lista que compararemos con la actual.
     * @return 
     */
    @Override
    public boolean equals(Lista<T> otra){
        boolean sonIguales;
        T datoPrimero;
        if(vacia()){
            sonIguales = otra.vacia();
        }else{
            if(!otra.vacia()){
                if(ini.equals(otra.acceder(0))){
                    datoPrimero = otra.eliminar(0);
                    sonIguales = sig.equals(otra);
                    otra.insertar(datoPrimero, 0);
                }else{
                    sonIguales = false;
                }
            }else{
                sonIguales = false;
            }
        }
        return false;
    }
    
    /**
     * metodo que genera un arreglo estático con los datos de la lista
     * @return 
     */
    @Override
    public T[] convertir(){
        T[] arreglo;
        arreglo = (T[])(new Object[longitud()]);
        convertir(arreglo, 0);
        return arreglo;
    }
    
    private void convertir(T[] arreglo, int i){
        if(!vacia()){
            arreglo[i] = ini;
            sig.convertir(arreglo, i + 1);
        }
    }
}
