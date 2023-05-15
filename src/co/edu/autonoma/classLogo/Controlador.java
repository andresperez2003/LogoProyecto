/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class Controlador {


    private Tortuga tortuga;
    private InstruccionTortuga instruccion;
    
    public Controlador() {
    }

    /**
     * @return the tortuga
     */
    public Tortuga getTortuga() {
        return tortuga;
    }

    /**
     * @param tortuga the tortuga to set
     */
    public void setTortuga(Tortuga tortuga) {
        this.tortuga = tortuga;
    }
    
    public void forward(int distance){
        InstruccionForward instruccion = new InstruccionForward(distance);
        tortuga.move(instruccion.getDistance());
        
    }
    
    public void backward(int distance){
        InstruccionBackward instruccion = new InstruccionBackward(distance);
        tortuga.move(instruccion.getDistance());
    }
    
    public void rigthTurn(int degree){
        InstruccionTortuga instruccion = new  InstruccionRigthTurn(degree);
    }
    
    public void leftTurn(int degree){
        InstruccionTortuga instruccion = new InstruccionLeftTurn(degree);
    }
    
    public void setColor(Color color){
        InstruccionTortuga instruccion = new InstruccionSetColor(color);
    }
    
    public void reset(){
        
    }
    
    public void home(){
        
    }
    
    public void load(){
        
    }
    
    public void save(){
        
    }
        /**
     * @return the instruccion
     */
    public InstruccionTortuga getInstruccion() {
        return instruccion;
    }

    /**
     * @param instruccion the instruccion to set
     */
    public void setInstruccion(InstruccionTortuga instruccion) {
        this.instruccion = instruccion;
    }
}