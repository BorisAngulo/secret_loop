/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author boris
 * @param <T>
 */
public class NodoDE<T>{
    private NodoDE<T> ant, suc;
    private T dato;
    
    public NodoDE(T dato){
        ant = suc = null;
        this.dato = dato;
    }
    
    public NodoDE<T> getAnt(){
        return ant;
    }
    
    public NodoDE<T> getSuc(){
        return suc;
    }

    public T getDato(){
        return dato;
    }
    
    public void setSuc(NodoDE<T> s){
        suc = s;
    }
    
    public void setAnt(NodoDE<T> a){
        ant = a;
    }
    
    public void setDato(T d){
        dato = d;
    }
}