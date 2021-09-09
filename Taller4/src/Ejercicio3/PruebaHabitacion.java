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
public class PruebaHabitacion {
    
    public static void main(String[] args) {
        Habitacion a = new Habitacion();
        a.setLargo(15);
        a.setAncho(25);
        a.setAltura(18);
        imprimirResultados(a);
        
    }
    public static void imprimirResultados(Habitacion a){
        System.out.printf("Para enchapar el piso se necesitan: %.2f m^2 de enchape%n" , a.enchapePiso() );
        System.out.printf("Para tapizar las paredes se necesitan: %.2f m^2 de tapizado %n", a.tapizarPared());
    }
    
}
