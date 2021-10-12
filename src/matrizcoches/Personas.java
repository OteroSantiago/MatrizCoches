/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizcoches;

/**
 *
 * @author Santiago
 */
public class Personas {
    private String nombre;
    //constructor
    public Personas(String nombre) {
        this.nombre = nombre;
    }
    //toString
    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + '}';
    }
    
}
