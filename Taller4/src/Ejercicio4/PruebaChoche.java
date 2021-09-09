/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author josec
 */
public class PruebaChoche {
    public static void main(String[] args) {
        
        Coche a = new Coche();
        Coche b = new Coche();
        Coche c = new Coche();
        
        a.setColor("Blanco");
        a.setMarca("BMW");
        a.setModelo("2021");
        a.setCaballos(90);
        a.setNumeroPuertas(4);
        a.setMatricula("BN273");
        
        b.setColor("Azul");
        b.setMarca("Mazda");
        b.setModelo("323");
        b.setCaballos(53);
        b.setNumeroPuertas(4);
        b.setMatricula("GF564");
        
        c.setMarca("Renoult");
        c.setModelo("2019");
        c.setCaballos(82);
        c.setNumeroPuertas(4);
        c.setMatricula("VX383");
        
        imprimirCoches(a);
        imprimirCoches(b);
        imprimirCoches(c);
    }
    
    public static void imprimirCoches(Coche a){
        
        System.out.println("Color: " + a.getColor());
        System.out.println("Modelo " + a.getModelo());
        System.out.println("Caballos de fuerza: " + a.getCaballos());
        System.out.println("Numero de puertas: " + a.getNumeroPuertas());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("-----------------------------------------------------");

    }
    
}
