/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo1;

/**
 *
 * @author Salvador
 */
public class Nodo1<T> {
public Nodo1 Siguiente;
	private String Data;
	public Nodo1(Nodo1 Sig, String Data) {
		this.Siguiente=Sig;
		this.Data=Data;
	}
	public String ObtenerData() {
		return Data;
	}
	public void ColocarData(String Data) {
		this.Data = Data;
	}
	public String toString() {
		return "Data: "+ Data;
	}
    
}
