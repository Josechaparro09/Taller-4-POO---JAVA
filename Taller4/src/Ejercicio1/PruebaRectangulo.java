/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.HashSet;

/**
 *
 * @author josec
 */
public class PruebaRectangulo {
    
    public static void main(String[] args) {
        
        Rectangulo a = new Rectangulo();
        Rectangulo b = new Rectangulo();
        Rectangulo c = new Rectangulo();
        a.setLongitud(15);
        a.setAncho(10);
        b.setAncho(5);
        b.setLongitud(12);
        c.setAncho(8);
        c.setLongitud(6);
        imprimirRectangulos(a);
        imprimirRectangulos(b);
        imprimirRectangulos(c);
        
    }
    public static void imprimirRectangulos(Rectangulo a){
      
            System.out.println("Longitud: " + a.getLongitud());
            System.out.println("Ancho: " + a.getAncho());
            System.out.println("Area: " + a.calcularArea());
            System.out.println("Perimetro: " + a.calcularPerimetro());
            System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    
}
