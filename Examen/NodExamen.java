/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Salvador
 */
public class NodExamen {
       public NodExamen Sig;
    private int Data;

    public NodExamen(NodExamen Sig, int Data){
        this.Sig = Sig;
        this.Data = Data;
    }
    public int getData() {
        return Data;
    }
    public void setData(int Data) {
        this.Data = Data;
    }
    public String toString(){
        return "Data: " + Data;
    }
    
}
