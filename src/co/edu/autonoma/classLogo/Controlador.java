/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import Instrucciones.InstruccionTortuga;
import Instrucciones.InstruccionRigthTurn;
import Instrucciones.InstruccionSetColor;
import Instrucciones.InstruccionBackward;
import Instrucciones.InstruccionLeftTurn;
import Instrucciones.InstruccionForward;
import Instrucciones.InstruccionHome;
import Instrucciones.InstruccionReset;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;

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
        InstruccionForward instruccionForward = new InstruccionForward(distance);
        tortuga.move(instruccionForward.parameter());
    }
    
    public void backward(int distance){
        InstruccionBackward instruccionBackward = new InstruccionBackward(distance);
        tortuga.move(instruccionBackward.parameter());
    }
    
    public void rigthTurn(int degree){
        InstruccionRigthTurn instruccionRigthTurn = new  InstruccionRigthTurn(degree);
        tortuga.changeDegree(instruccionRigthTurn.getDegree());
    }
    
    public void leftTurn(int degree){
        InstruccionLeftTurn instruccionLeftTurn = new InstruccionLeftTurn(degree);
        tortuga.changeDegree(instruccionLeftTurn.getDegree());
    }
    
    public void setColor(String color){
        InstruccionSetColor instruccionSetColor = new InstruccionSetColor(color);
        tortuga.setColor(instruccionSetColor.getColor());
    }
    
    public void reset(){
        InstruccionReset instruccionReset = new InstruccionReset();
        tortuga.resetMove();
    }
    
    public void home(){
        InstruccionHome instruccionHome = new InstruccionHome();
        tortuga.resetPosition();
    }
    
    public void load(){
        
    }
    
    public void save(ArrayList<String> comandos){
        
        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);
        File f;
        FileWriter escritorArchivo;
        f = new File(guardarComo.getSelectedFile()+".txt");
        
        try {
            escritorArchivo = new FileWriter(f);
            
            BufferedWriter bw = new BufferedWriter(escritorArchivo);
            PrintWriter salida = new PrintWriter(bw);
            for(String comando: comandos){
                salida.write(comando+'\n');
            }
            salida.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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