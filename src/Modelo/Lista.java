
package Modelo;

/**
 *
 * @author boris
 * @param <T>
 */
public interface Lista<T>{

    public boolean vacia();
    public void insertar(T dato);
    public T eliminar(int index);
    public T acceder(int index);
    public int longitud();  
    public boolean insertar(T dato, int index);
    public boolean buscar(T dato);
    public int indiceDe(T dato);   
    public int indiceDe(T dato, int desde);
    @Override
    public String toString();
    public void insertarTodos(Lista<T> otra);
    public Lista<T> clonar();   
    public void limpiar();
    public T eliminarIni();
    public T elimiarUlt();
    public void setDato(T dato, int index);
    public boolean equals(Lista<T> otra);
    public T[] convertir();
}