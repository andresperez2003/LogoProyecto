/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author juane
 */
public class Tablero extends Sprite implements Drawable, Dimensionable{
    
    private Tortuga tortuga;
    private Drawable drawable;
    private Controlador controlador;

    public Tablero(int width, int height) {
        super(0, 0, width, height);
        tortuga = new Tortuga("#0000", 0,width/2, height/2);
        tortuga.setDrawable(this);
        tortuga.setArea(this);
        controlador = new Controlador();
        controlador.setTortuga(tortuga);
        tortuga.setDimensionable(this);
    }
    

    @Override
    public void redraw() {
        drawable.redraw();
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    @Override
    public void draw(Graphics g) {
        tortuga.draw(g);
    }

    /**
     * @return the controlador
     */
    public Controlador getControlador() {
        return controlador;
    }
    
}
