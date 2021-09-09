/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author josec
 */
public class Rectangulo {
    
    private double longitud;
    private double ancho;
    
    public Rectangulo(){
        this.ancho=0;
        this.longitud=0;
    }
    public double getLongitud(){
        return this.longitud;
    }
    public double getAncho(){
        return this.ancho;
    }
    public void setLongitud(double longitud){
        
        this.longitud = longitud;
        
    }
    public void setAncho(double ancho){
        this.ancho  = ancho;
    }
    public double calcularArea(){
        return this.ancho*this.longitud;
    }
    public double calcularPerimetro(){
        return 2*(this.longitud+this.ancho);
    }
    
}
