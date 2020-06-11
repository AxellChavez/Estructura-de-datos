/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.io.*;

import java.util.Random;
/**
 *
 * @author Salvador
 */
public class Examen {
    public static void main(String[] args) {
        Random Spwaner = new Random();
        PilaExamen ListaMadera= new PilaExamen();
        PilaExamen ListaHilo =new PilaExamen();
        PilaExamen ListaResina = new PilaExamen();
        int maderaAcumulada=0,hiloAcumulada=0,resinaAcumulada=0; //++
        int madera=0,hilo=0,resina=0,baston=0,cuerda=0,cana=0; 
        int mesaHerramineta=0,bastonHerramineta=0,cuerdaHerramineta=0,canaHerramienta=0,barcoHerramineta=0;
        for(int i=1;i<=30;i++){
            System.out.println("DIA 1"+ i );
            try{
                int x = Spwaner.nextInt(3);
                if(x == 0){
                    System.out.println("--HAS ENCONTRADO 1 DE MADERA--");
                    ListaMadera.ApilacionP(x);
                    madera++;
                    maderaAcumulada++;
                }else if(x == 1){
                    System.out.println("--HAS ENCONTRADO 1 DE HILO--");
                    ListaHilo.ApilacionP(x);
                    hilo++;
                    hiloAcumulada++;
                }else if(x == 2){
                    System.out.println("--HAS ENCONTRADO 1 DE RESINA-- ");
                    ListaResina.ApilacionP(x);
                    resina++;
                    resinaAcumulada++;
                }

                if(madera == 4){
                    ListaMadera.SacarP();
                    ListaMadera.SacarP();
                    ListaMadera.SacarP();
                    ListaMadera.SacarP();
                    madera = madera - 4;
                    mesaHerramineta++;
                    System.out.println("Crafteaste una mesa");
                }

                if(mesaHerramineta == 1 && madera == 2){
                    ListaMadera.SacarP();
                    ListaMadera.SacarP();
                    madera = madera - 2;
                    baston++;
                    mesaHerramineta++;
                    System.out.println("Crafteaste un bastón");
                }

                if(mesaHerramineta == 1){
                    if(hilo >= 4 && resina >= 1){
                        ListaHilo.SacarP();
                        ListaHilo.SacarP();
                        ListaHilo.SacarP();
                        ListaHilo.SacarP();

                        //listaR.EliminarAlInicio();
                        hilo = hilo - 4;
                        resina = resina - 1;
                        cuerda++;
                        cuerdaHerramineta++;
                        System.out.println("Crafteaste una cuerda");
                    }
                }

                if(mesaHerramineta == 1){
                    if(cuerda >=1 && baston >= 1){
                        cuerda = cuerda - 1;
                        baston = baston - 1;
                        cana++;
                        canaHerramienta++;
                        System.out.println("Crafteaste una caña");
                    }
                }

                if (mesaHerramineta == 1 && cana >= 1)
                {
                    cana = cana - 1;
                    barcoHerramineta++;
                    System.out.println("Has crafteado un barco");
                }
            }catch(DesbordamientoPila err){
                System.out.println(err.getMessage());
            } catch (SubdesPilas er){
                System.out.println(er.getMessage());
            }
        } // FIN DEL CLICO FOR

        System.out.println("OBTUVISTES ");
        System.out.println("Madera " + maderaAcumulada);
        System.out.println("Resina " + resinaAcumulada);
        System.out.println("Hilo " + hiloAcumulada);
        System.out.println();
        System.out.println("HERRAMIENTA OBTENIDA");
        System.out.println("CANA "+canaHerramienta);
        System.out.println("MESA "+mesaHerramineta);
        System.out.println("BASTON "+bastonHerramineta);
        System.out.println("CUERDA "+cuerdaHerramineta);
        System.out.println("BaARCO"+barcoHerramineta);

    }
}
    

