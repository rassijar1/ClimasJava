/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Persistencia {

    private DataOutputStream salida;
    private DataInputStream entrada;
    private DataOutputStream salida1;
    private DataInputStream entrada2;

    public void abrir(String nombreArchivo) {

        try {
            entrada2= new DataInputStream(new FileInputStream(nombreArchivo));
            entrada = new DataInputStream(new FileInputStream(nombreArchivo));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrar() {
        try {
            entrada.close();
            entrada2.close();
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Procesoclima leer() {
        Procesoclima objetoClima = new Procesoclima();
        String renglon;
        try {
            while ((renglon = entrada.readLine()) != null) {
                String campo[] = renglon.split(";");
                Clima objAux = new Clima();
              objAux.setLluvia(Float.parseFloat(campo[4]));
                objAux.setTemperatura(Float.parseFloat(campo[1]));
                objAux.setTemperatura2(Float.parseFloat(campo[2]));
                objAux.setTemperatura3(Float.parseFloat(campo[3]));
               objAux.setNieve(Float.parseFloat(campo[6]));
                objAux.setPuesta(Integer.parseInt(campo[7]));
                objAux.setOculta(Integer.parseInt(campo[8]));
                
                 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                objAux.setFecha(formatter.parse(campo[0]));
                objetoClima.getListaclima().add(objAux);
                objetoClima.getListaclima2().add(objAux);

            }
            
            while ((renglon = entrada2.readLine()) != null) {
                String campo[] = renglon.split(";");
                Clima objAux = new Clima();
              
                objAux.setTemperatura(Float.parseFloat(campo[1]));
                objAux.setTemperatura2(Float.parseFloat(campo[2]));
                objAux.setTemperatura3(Float.parseFloat(campo[3]));
               

            }

        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return objetoClima;

    }

    public void guardar(Clima tempMenor, Clima tempMayor ,Clima Lluvia , Clima Nieve,  Clima Puestamenor,Clima Ocultamenor, Clima temp14, Clima Tempmay14,Clima Tempmay20, Clima Tempmen20) {
       
        try {
            salida = new DataOutputStream(new FileOutputStream("climas.txt"));
             
            salida.writeBytes("Datos :"
                    + "\r\n  clima menor a las 08:00 h: " + tempMenor.getTemperatura()
                    + " registrado el dia  " + tempMenor.getFecha()
                    + "\r\n  clima mayor a las 08:00 h: " + tempMayor.getTemperatura()
                    +" registrado el dia  " + tempMayor.getFecha()
                   + "\r\n  clima menor a las 14:00 h: " + temp14.getTemperatura2()
                    + " registrada el dia  " + temp14.getFecha()
                    + "\r\n  clima mayor a las 14:00 h: " + Tempmay14.getTemperatura2()
                    + " registrada el dia  " + Tempmay14.getFecha()
                    + "\r\n  clima menor a las 20:00 h: " + Tempmay20.getTemperatura3()
                    + " registrada el dia  " + Tempmay20.getFecha()
                    + "\r\n  clima mayor a las 20:00 h: " + Tempmen20.getTemperatura3()
                    + " registrada el dia  " + Tempmen20.getFecha()
                    + "\r\n  Aumento de lluvias: "+ Lluvia.getLluvia()
                  +" registrada el dia  " + Lluvia.getFecha()
                    + "\r\n  Aumento de nieve: "+ Nieve.getNieve()
                  +" registrada el dia  " + Nieve.getFecha()
                     + "\r\n  Hora puesta sol mas temprano: " +"06:"+ Puestamenor.getPuesta()
                    +" registrada el dia  " + Puestamenor.getFecha()
                    + "\r\n  Hora oculta sol mas temprano: " +"17:"+ Ocultamenor.getOculta()
                    +" registrada el dia  " + Ocultamenor.getFecha()
            );
               
            
            

            salida.flush();
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void guardarconversion(Procesoclima conversion) {
        String temp = "", temp2="", temp3="";
        
        try {
            salida1= new DataOutputStream(new FileOutputStream("Conversion.txt"));
           
           
            salida1.flush();
                    salida1.writeBytes(temp+"\n"+temp2+"\n"+"\n"+temp3+"\n");
                   
            for (int i = 0; i < conversion.getListaclima().size(); i++) {
            temp=( "-----------------------------------------------------------------------"
                    +"\r\nTemperaturas semanales 08:00 h: " 
                     +conversion.getListaclima().get(i).getTemperatura()
                    + "\r\n  Temperaturas convertidas a celsius: " 
                    + (conversion.getListaclima().get(i).getTemperatura()-32)/1.8
                    + "\r\n  Temperaturas convertidas a  Kelvin: "
                    + (((conversion.getListaclima().get(i).getTemperatura()-32)*0.5555)+273.15));
                  
               salida1.writeBytes(temp);
               salida1.flush();
                 
            }
                 for (int i = 0; i < conversion.getListaclima2().size(); i++) {
            temp2=( "-----------------------------------------------------------------------"+
                    "\r\nTemperaturas semanales 14:00 h : " 
                     +conversion.getListaclima2().get(i).getTemperatura2()
                    + "\r\n  Temperaturas convertidas a celsius: " 
                    + (conversion.getListaclima2().get(i).getTemperatura2()-32)/1.8
                    + "\r\n  Temperaturas convertidas a  Kelvin: "
                    + (((conversion.getListaclima2().get(i).getTemperatura2()-32)*0.5555)+273.15)
                   
                    );
                  
               salida1.writeBytes(temp2);
               salida1.flush();
                 
            }
            
                  for (int i = 0; i < conversion.getListaclima2().size(); i++) {
            temp3=( "-----------------------------------------------------------------------"
                   + "\r\nTemperaturas semanales 20:00 h: " 
                     +conversion.getListaclima2().get(i).getTemperatura3()
                    + "\r\n  Temperaturas convertidas a celsius: " 
                    + (conversion.getListaclima2().get(i).getTemperatura3()-32)/1.8
                    + "\r\n  Temperaturas convertidas a  Kelvin: "
                    + (((conversion.getListaclima2().get(i).getTemperatura3()-32)*0.5555)+273.15));
                  
               salida1.writeBytes(temp3);
               salida1.flush();
                 
            }
           
               
            
           
            salida1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    

}
