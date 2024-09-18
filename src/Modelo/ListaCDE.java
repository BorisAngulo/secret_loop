
package Modelo;

/**
 *
 * @author boris
 */
public class ListaCDE<T> implements Lista<T> {
    private NodoDE<T> ini;
    /**
     * construye una listaCDE vacia.
     */
    public ListaCDE(){
        ini = null;
    }
    
    /**
     * metodo vacia que retorna true si la lista esta vacia, false si no lo esta.
     */
    public boolean vacia(){
       return ini == null; 
    }
    
    /**
     * metodo insertar permite insertar el dato al final de la lista
     * @param dato dato que se insertara en la lista.
     */
    public void insertar(T dato){
        NodoDE<T> p, ult;
        p = new NodoDE<T>(dato);
        if(vacia()){
            ini = p;
            ini.setSuc(ini);
            ini.setAnt(ini);
        }
        else{
            ult = ini.getAnt();
            ult.setSuc(p);
            p.setAnt(ult);
            p.setSuc(ini);
            ini.setAnt(p);
        }
    }
    
    /**
     * metodo eliminar permite eliminar un dato de la lista si existiera
     * Y devuelve el dato eliminado, en caso de no haber la posicion
     * no se altera la lista.
     * @param index posicion de la lista que se eliminara.
     */
    public T eliminar(int index){
        T res;
        NodoDE<T> q, s, r;
        if(vacia()){
            res = null;
        }
        else{
            q = buscar(ini, index);
            res = q.getDato();
            s = q.getSuc();
            r = q.getAnt();
            r.setSuc(s);
            s.setAnt(r);
            if(ini == q){
                ini = s;
            }
            if(q == s){
                ini = null;
            }
        }
        return res;
    }
    
    private NodoDE<T> buscar(NodoDE<T> q, int index){
        NodoDE<T> elNodo;
        
        if(index == 0){
            elNodo = q;
        }
        else{
            elNodo = buscar(q.getSuc(), index - 1);
        }
        return elNodo;
    }
    
    /**
     * metodo acceder permite acceder a un dato de la lista.
     * @param index posicion de la lista al que se accedera.
     */
    public T acceder(int index){
        T res;
        NodoDE<T> q;
        if(vacia()){
            return null;
        }
        else{
            q = buscar(ini, index);
            res = q.getDato();
        }
        return res;
    }
    
    /**
     * metodo que devuelve el numero de datos que almacena la estructura
     */
    public int longitud(){
        int longitud;
        if(vacia()){
            longitud = 0;
        }else{
            longitud = contar(ini);
        }
        return longitud;
    }
    
    private int contar(NodoDE<T> q){
        int contador;
        if(q.getSuc() == ini){
            contador = 1;
        }else{
            contador = 1 + contar(q.getSuc());
        }
        return contador;
    }
    
     /**
     * metodo que inserta un dato en la posicion.
     * @param dato dato que se insertara en una posicion dada.
     * @param index posicion en la que se insertara el dato
     */
    public boolean insertar(T dato, int index){
        return false;
    }
    
    /**
     * metodo que devuelve true si el dato pertenece a la estructura, caso 
     * contrario lo devuelve false
     * @param dato dato que veremos si existe o no en la lista
     */
    public boolean buscar(T dato){
        boolean esta;
        NodoDE<T> q;
        if(vacia()){
            esta = false;
        }else{
            q = buscar(ini, dato);
            esta = q != null;
        }
        return esta;
    }
    
    private NodoDE<T> buscar(NodoDE<T> q, T dato){
        NodoDE<T> elNodo;
        if(q.getDato().equals(dato)){
            elNodo = q;
        }else{
            if(q.getSuc() == ini){
                elNodo = null;
            }else{
                elNodo = buscar(q.getSuc(), dato);
            }
        }
        return elNodo;
    }
    
    /**
     * metodo que devuelve la posicion del dato si es que este pertenece a la
     * estructura, caso contrario devuelve -1.
     * @param dato dato que mostrara en que posicion se encuentra
     */
    public int indiceDe(T dato){
        int pos;
        if(vacia()){
            pos = -1;
        }else{
            pos = indiceDe(dato, ini);
        }
        return pos;
    }
    
    private int indiceDe(T dato, NodoDE<T> q){
        int pos;
        if(dato.equals(q.getDato())){
            pos = 0;
        }else{
            if(q.getSuc() != ini){
                pos = indiceDe(dato, q.getSuc());
                if(pos != -1){
                    pos++;
                }
            }else{
                pos = -1;
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
     */
    public int indiceDe(T dato, int desde){
        int pos;
        NodoDE<T> q;
        if(vacia()){
            pos = -1;
        }else{
            q = buscar(ini, desde);
            pos = indiceDe(dato, q);
            if(pos != -1){
                pos = pos + desde;
            }
        }
        return pos;
    }
    
    /**
     * metodo permite serializar en una cadena a los datos de la estructura
     */
    public String toString(){
        return null;
    }
    
    /**
     * metodo que permite insertar todos los datos de la otra lista en esta.
     * @param otra lista a la que insertaremos
     */
    public void insertarTodos(Lista<T> otra){
    }
    
    /**
     * metodo que permite clonar la estructura
     */
    public Lista<T> clonar(){
        return null;
    }
    
    /**
     * metodo que permite vaciar la lista.
     */
    public void limpiar(){
        if(!vacia()){
            ini = null;
        }
    }
    
    /**
     * metodo que permite eliminar el primer elemento de la lista.
     */
    public T eliminarIni(){
        return null;
    }
    
    /**
     *metodo que permite elimiar el ultimo elemento de la lista. 
     */
    public T elimiarUlt(){
        return null;
    }
    
    /**
     * metodo que permite cambiar el dato de la posicion index si es que existiera
     * @param dato dato que colocaremos en el de la pos.
     * @param pos posicion en la que cambiaremos el dato.
     */
    public void setDato(T dato, int index){
        NodoDE<T> q;
        if(!vacia()){
            q = buscar(ini, index);
            q.setDato(dato);
        }
    }
    
    /**
     * metodo que verifica si el contenido de la lista con la otra son iguales.
     * @param otra lista que compararemos con la actual.
     */
    public boolean equals(Lista<T> otra){
        boolean sonIguales;
        if(vacia()){
            sonIguales = otra.vacia();
        }else{
            if(!otra.vacia()){
                sonIguales = equals(otra, ini);
            }else{
                sonIguales = false;
            }
        }
        return sonIguales;
    }
    
    private boolean equals(Lista<T> otra, NodoDE<T> q){
        boolean sonIguales;
        T datoPrimero;
        if(!otra.vacia()){
            if(otra.acceder(0).equals(q.getDato())){
                datoPrimero = otra.eliminar(0);
                sonIguales = equals(otra, q.getSuc());
                otra.insertar(datoPrimero, 0);
            }else{
                sonIguales = false;
            }
        }else{
            sonIguales = q == ini;
        }
        return sonIguales;
    }
    
    /**
     * metodo que genera un arreglo estático con los datos de la lista
     */
    public T[] convertir(){
        T[] arreglo;
        arreglo = (T[])(new Object[longitud()]);
        if(!vacia()){
            convertir(arreglo, 0, ini);
        }
        return arreglo;
    }
    
    private void convertir(T[] arreglo, int i, NodoDE<T> q){
        if(i < arreglo.length){
            arreglo[i] = q.getDato();
            convertir(arreglo, i+1, q.getSuc());
        }
    }
}