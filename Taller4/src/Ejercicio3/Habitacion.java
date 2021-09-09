/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author josec
 */
public class Habitacion {
    
    private double largo;
    private double ancho ;
    private double altura;
    public Habitacion(){
        
    }
    public double getLargo(){
        return this.largo;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getAltura(){
        return this.altura ;
    }
    public void setLargo(double largo){
        this.largo=largo;
    }
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double enchapePiso(){
        return this.largo*this.ancho;
    }
    public double tapizarPared(){
        return (2*(this.altura*this.largo))+(2*(this.altura*this.ancho));
    }
    
}
