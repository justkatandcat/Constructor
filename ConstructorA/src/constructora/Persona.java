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
public class Persona {
    int edad=0;
    int escuela=0;
    int cantidadTarea=0;
    int cafe=0;
    int horasDormidas=0;
    
    Persona(int edad, int escuela){
        this.edad=edad;
        this.escuela=escuela;
    }
    
    public void dormir(int tarea, int cafe){
        this.cantidadTarea=tarea;
        this.cafe=cafe;
    }
}
