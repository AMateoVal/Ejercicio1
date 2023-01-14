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
public class Coche {
    //Declaracion de parametros
    //Casi siempre private

    private String matricula;
    private String marca;
    private long km;
    private int anyos;

    public Coche(String matricula, String marca) {
        this.matricula = matricula;// variable de la clase
        this.marca = marca;

    }

    public Coche(String matricula, String marca, long km) {
        this.matricula = matricula;// variable de la clase
        this.marca = marca;
        this.km = km;
    }

    /**
     *
     * @return Nos devuelve los parametros que dimos al coche
     */
    public String dameCoche() {
        return "Matricula: " + matricula + " Modelo: " + marca + " Km: " + km
                + " Años: " + anyos;

    }

    public void setKm(long km) {
        this.km = km;

    }
/**
 * nos da el valor en un long
 * @return nos devuelve los kilometros
 */
    public long getKm() {
        return km;

    }
/**
 * 
 * @param otroCoche
 * @return 
 */
    public boolean esMasNuevo(Coche otroCoche) {
       /* if (this.km > otroCoche.getKm()) {
            return false;

        } else {
            return true;
        }*/
    return otroCoche.km>this.km;
    }
}
