/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobleenlazada;

/**
 *
 * @author Salvador
 */
public class Nodo <T> {
    public Nodo Anterior;	
    public Nodo Siguiente;
    private int Tipo;
    private T Data;
    public Nodo(T Data, int Tipo){
        this.Tipo = Tipo;
        this.Data = Data;
        Anterior = null;
        Siguiente = null;
    }
    public T obtenerData(){
        return Data;
    }
    public void asignarData(T Data){
        this.Data = Data;
    }
    public String toString(){
        return ""+Data;
    }
    public int obtenerTipo(){
        return Tipo;
    }  
}