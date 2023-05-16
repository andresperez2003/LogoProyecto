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
    private Color color;

    public InstruccionSetColor(Color color) {
        this.color = color;
    }
    
    

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
}
