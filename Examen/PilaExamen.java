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
public class PilaExamen {
        private listaEnlazada Esq;

    public PilaExamen(){
        Esq = new listaEnlazada();
    }

    public void ApilacionP(int n) throws  DesbordamientoPila{
        Esq.AgregacionInical(new NodExamen(null,n));
    }

    public NodExamen SacarP() throws SubdesPilas{
        NodExamen esacar = Esq.EliminacionInicial();
        return esacar;
    }
    
}
