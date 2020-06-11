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
public class DesbordamientoPila extends Exception {
     public DesbordamientoPila(){
     super("No se podrá apliar otro elemento");
      }
}