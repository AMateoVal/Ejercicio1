/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author mateo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coche c = new Coche("2378DGF", "Seat");
        Coche c2 = new Coche("2593YTU", "Renault");
        Coche c3 = new Coche("9754AAA", "Ford", 17283);
        Coche c4 = new Coche("97AAA", "Mustang", 172999);
        System.out.println(c.dameCoche());
        System.out.println(c2.dameCoche());
        System.out.println(c3.dameCoche());
        System.out.println(c4.dameCoche());
        c3.setKm(12000);
        System.out.println(c3.dameCoche());
        // cambiamos un valor a la variable de la clase
        c3.setKm(500);
        System.out.println(c3.dameCoche());

        c2.setKm(50000);
        System.out.println(c3.esMasNuevo(c2));
        System.out.println(c2.esMasNuevo(c3));

    }

}
