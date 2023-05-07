/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;


public class Procesoclima {

    ArrayList<Clima> listaclima = new ArrayList();
    ArrayList<Clima> listaclima2 = new ArrayList();
  
    public ArrayList<Clima> getListaclima2() {
        return listaclima2;
    }

    public void setListaclima2(ArrayList<Clima> listaclima2) {
        this.listaclima2 = listaclima2;
    }
    ;
    public ArrayList<Clima> getListaclima() {
        return listaclima;
    }

    public void setListaclima(ArrayList<Clima> listaclima) {
        this.listaclima = listaclima;
    }

    
  public Clima PuestaMenor() {
        int i;
        Clima objetoClima = new Clima();
        objetoClima.setFecha(listaclima2.get(0).getFecha());
        objetoClima.setPuesta(listaclima2.get(0).getPuesta());

        for (i = 0; i < listaclima2.size(); i++) {
            if (listaclima2.get(i).getPuesta()< objetoClima.getPuesta()) {
                
                objetoClima.setFecha(listaclima2.get(i).getFecha());
                objetoClima.setPuesta(listaclima2.get(i).getPuesta());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
        }

        return (objetoClima);
    }
    
    
  public Clima OcultaMenor() {
        int i;
        Clima objetoC = new Clima();
        objetoC.setFecha(listaclima2.get(0).getFecha());
        objetoC.setOculta(listaclima2.get(0).getOculta());

        for (i = 0; i < listaclima2.size(); i++) {
            if (listaclima2.get(i).getOculta()<objetoC.getOculta()) {
                
                objetoC.setFecha(listaclima2.get(i).getFecha());
                objetoC.setOculta(listaclima2.get(i).getOculta());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
            
        }

        return (objetoC);
    }

    public Clima TempMenor() {
        int i;
        Clima objetoC = new Clima();
        objetoC.setFecha(listaclima.get(0).getFecha());
        objetoC.setTemperatura(listaclima.get(0).getTemperatura());

        for (i = 0; i < listaclima.size(); i++) {
            if (listaclima.get(i).getTemperatura()< objetoC.getTemperatura()) {
                
                objetoC.setFecha(listaclima.get(i).getFecha());
                objetoC.setTemperatura(listaclima.get(i).getTemperatura());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
            
        }

        return (objetoC);
    }
    
    
     public Clima TempMenor14() {
        int i;
        Clima objetoC = new Clima();
        objetoC.setFecha(listaclima2.get(0).getFecha());
        objetoC.setTemperatura2(listaclima2.get(0).getTemperatura2());

        for (i = 0; i < listaclima2.size(); i++) {
            if (listaclima2.get(i).getTemperatura2()< objetoC.getTemperatura2()) {
                
                objetoC.setFecha(listaclima2.get(i).getFecha());
                objetoC.setTemperatura2(listaclima2.get(i).getTemperatura2());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
            
        }

        return (objetoC);
    }
     
     public Clima TempMayor14() {
        int i;
        Clima objetoC = new Clima();
        objetoC.setFecha(listaclima2.get(0).getFecha());
        objetoC.setTemperatura2(listaclima2.get(0).getTemperatura2());

        for (i = 0; i < listaclima2.size(); i++) {
            if (listaclima2.get(i).getTemperatura2()> objetoC.getTemperatura2()) {
                
                objetoC.setFecha(listaclima2.get(i).getFecha());
                objetoC.setTemperatura2(listaclima2.get(i).getTemperatura2());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
            
        }

        return (objetoC);
    }
     
     
     
      public Clima TempMenor20() {
        int i;
        Clima objetoC = new Clima();
        objetoC.setFecha(listaclima2.get(0).getFecha());
        objetoC.setTemperatura3(listaclima2.get(0).getTemperatura3());

        for (i = 0; i < listaclima2.size(); i++) {
            if (listaclima2.get(i).getTemperatura3()< objetoC.getTemperatura3()) {
                
                objetoC.setFecha(listaclima2.get(i).getFecha());
                objetoC.setTemperatura3(listaclima2.get(i).getTemperatura3());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
            
        }

        return (objetoC);
    }
     
     public Clima TempMayor20() {
        int i;
        Clima objetoC = new Clima();
        objetoC.setFecha(listaclima2.get(0).getFecha());
        objetoC.setTemperatura3(listaclima2.get(0).getTemperatura3());

        for (i = 0; i < listaclima2.size(); i++) {
            if (listaclima2.get(i).getTemperatura3()> objetoC.getTemperatura3()) {
                
                objetoC.setFecha(listaclima2.get(i).getFecha());
                objetoC.setTemperatura3(listaclima2.get(i).getTemperatura3());
                 //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
            }

            
            
        }

        return (objetoC);
    }
     
     
    
    
    public Clima TempMayor() {
        int i;
        Clima objetoC= new Clima();
        
        objetoC.setFecha(listaclima.get(0).getFecha());
        objetoC.setTemperatura(listaclima.get(0).getTemperatura());

        for (i = 0; i < listaclima.size(); i++) {
            
            if  (listaclima.get(i).getTemperatura()> objetoC.getTemperatura()) {
           
                objetoC.setFecha(listaclima.get(i).getFecha());
                objetoC.setTemperatura(listaclima.get(i).getTemperatura());
                //System.out.println("Hay temperaturas repetidas" +listaclima.get(i).getFecha()+" "+listaclima.get(i).getTemperatura());
                
                
            }
      
        }

        return (objetoC);
    }

    
    
    public Clima lluvias() {
        int i;
        Clima objetoClima = new Clima();
        
        objetoClima.setFecha(listaclima.get(0).getFecha());
        objetoClima.setLluvia(listaclima.get(0).getLluvia());

        for (i = 0; i < listaclima.size(); i++) {
            if (listaclima.get(i).getLluvia()>objetoClima.getLluvia()) {
                
                objetoClima.setFecha(listaclima.get(i).getFecha());
                objetoClima.setLluvia(listaclima.get(i).getLluvia());
                // System.out.println("Hay " +listaclima.get(i).getFecha()+" "+listaclima.get(i).getLluvia());
                
            }

            
        }

        return (objetoClima);
    }

    
      public Clima nieve() {
        int i;
        Clima objetoClima = new Clima();
        
        objetoClima.setFecha(listaclima.get(0).getFecha());
        objetoClima.setNieve(listaclima.get(0).getNieve());

        for (i = 0; i < listaclima.size(); i++) {
            if (listaclima.get(i).getNieve()> objetoClima.getNieve()) {
                
                objetoClima.setFecha(listaclima.get(i).getFecha());
                objetoClima.setNieve(listaclima.get(i).getNieve());
                // System.out.println("Hay " +listaclima.get(i).getFecha()+" "+listaclima.get(i).getLluvia());
                
            }

            
        }

        return (objetoClima);
    }
    
    
    /*public Clima celsius(){
   
    int i;
        Clima objetoClima = new Clima();
        objetoClima.setFecha(listaclima.get(0).getFecha());
       objetoClima.setTemperatura(listaclima.get(0).getTemperatura());
        

        for (i = 0; i < listaclima.size(); i++) {
            
                if(listaclima.get(i).getTemperatura()!=objetoClima.getTemperatura()){
                
               listaclima.get(i).getTemperatura();
                 System.out.println(" hay" + listaclima.get(i).getTemperatura());
               
                }
               
                
            

            
        }
        return (objetoClima);
    }*/



    

}
