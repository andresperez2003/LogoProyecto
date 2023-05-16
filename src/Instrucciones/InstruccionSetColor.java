/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instrucciones;

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class InstruccionSetColor extends InstruccionTortuga {
    private String color;

    public InstruccionSetColor(String color) {
        this.color = color;
    }
    
    

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
