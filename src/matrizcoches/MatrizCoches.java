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
public class MatrizCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String coches [][] = {{"Ford", "Cadillac"},{"Opel","Seat"},{"Lexus","Mazda"}};
        //La primera fila tiene coches americanos, la segunda coches europeaos, la tercera coches asiáticos
        //Una caracteristica es que no tienen porque ser matrices cuadradas, pueden variar el número de elementos de cada fila
        for (var i = 0; i < coches.length; i++){
            for(int j = 0; j < coches[i].length; j++){
                System.out.println("elemento ["+i+"]["+j+"]= "+coches[i][j]);
            }
        }
        //Personas
        Personas personas[][] = new Personas[2][3];
        personas [0][0] = new Personas("Ernesto");
        personas [0][1] = new Personas("David");
        personas [0][2] = new Personas("Javier");
        personas [1][0] = new Personas("Rosendo");
        personas [1][1] = new Personas("Diego");
        personas [1][2] = new Personas("Paco");
      
        imprimir(personas);
    }
    public static void imprimir(Object matriz[][]){
        for(var i=0; i<matriz.length;i++){
            for(int j = 0; j<matriz[i].length;j++){
                System.out.println("matriz ["+i+"]["+j+"]=" +matriz[i][j]);
            }
        }
    }
  
    
}
