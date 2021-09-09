/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio1.PruebaRectangulo;

/**
 *
 * @author josec
 */
public class PruebaEcuacion {
    
   
    public static void main(String[] args) {
        
        Ecuacion a = new Ecuacion();
        Ecuacion b = new Ecuacion();
        Ecuacion c = new Ecuacion();
        a.setA(1);
        b.setB(-4);
        c.setC(4);
        imprimirResultado( a , b , c);
    }
    
    public static void imprimirResultado(Ecuacion a , Ecuacion b , Ecuacion c){
                
        double discriminante = (-b.getB()*-b.getB())-(4*a.getA()*c.getC());
        double x , x1 , x2 , k , z;
        int A = a.getA();
        int B= b.getB();
        int C= c.getC();
        
        if (discriminante==0) {
            
            x=-b.getB()/(2*a.getA());
            System.out.println("Es un trinomio cuadrado perfecto, Y= " + x);
            
        } else {
            if (discriminante>0) {
                
                x1=(-B-Math.sqrt(discriminante))/(2*A);
                x2=(-B+Math.sqrt(discriminante))/(2*A);
                System.out.println("Tiene 2 soluciones reales , Y1 = " + x1 + " , Y2 = " + x2);

            }else{
                k=(-B)/(2*A);
                z=(Math.sqrt(Math.abs(discriminante)))/(2*A);
                System.out.printf("Tiene 2 soluciones complejas ,  Y1=%.2f+%.2fi Y2= %.2f-%.2fi" , k , z, k , z);
            }
        }
    }
}
