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
public class Coche {
    int color=0;
    int gasolina=0;
    int metros=0;
    int friccion=0;
        
    public void acelerar(){
        
    }
    public void frenar(int metros, int friccion){
        this.metros=metros;
        this.friccion=friccion;
    }
    
    public void arrancar(){
        
    }
    
    Coche (int color, int gasolina){
        this.color=color;
        this.gasolina=gasolina;
    }
}
