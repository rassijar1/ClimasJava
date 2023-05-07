/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

public class Clima {

    private Date fecha;
  
    private float temperatura;
     private float temperatura2;
      private float temperatura3;
    private float nieve;
    private float lluvia;
    private int viento;
    private int puesta;
    private int oculta;

    public float getTemperatura2() {
        return temperatura2;
    }

    public void setTemperatura2(float temperatura2) {
        this.temperatura2 = temperatura2;
    }

    public float getTemperatura3() {
        return temperatura3;
    }

    public void setTemperatura3(float temperatura3) {
        this.temperatura3 = temperatura3;
    }

    
    public int getPuesta() {
        return puesta;
    }

    public void setPuesta(int puesta) {
        this.puesta = puesta;
    }

    public int getOculta() {
        return oculta;
    }

    public void setOculta(int oculta) {
        this.oculta = oculta;
    }
   
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getNieve() {
        return nieve;
    }

    public void setNieve(float nieve) {
        this.nieve = nieve;
    }

    public float getLluvia() {
        return lluvia;
    }

    public void setLluvia(float lluvia) {
        this.lluvia = lluvia;
    }

    public int getViento() {
        return viento;
    }

    public void setViento(int viento) {
        this.viento = viento;
    }

}
