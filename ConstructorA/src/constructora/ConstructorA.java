/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora;

/**
 *
 * @author Alumno
 */
public class ConstructorA {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        //Coche coche=new Coche();  // Error porque el constructor no esta vacio
       
        Coche coche=new Coche(1,3);    
        Coche frenar=new Coche(1,1);
        Persona persona=new Persona(17, 9);
        Persona dormir=new Persona(10, 2);
        
    }
    
}
