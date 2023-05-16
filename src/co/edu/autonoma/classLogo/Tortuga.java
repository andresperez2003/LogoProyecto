/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Tortuga extends Sprite implements Drawable{
    private String color; 
    private int degree;
    private Drawable drawable;
    private Dimensionable dimensionable;
    private ArrayList<Rastro> rastros ;
    public Tortuga(String color, int degree, int posX, int posY) {
        super(posX, posY, 50, 50);
        this.color = color;
        this.degree = degree;
        this.rastros = new ArrayList<>();
    }

    
    public void resetMove(){
        setColor("#0000");
        setDegree(0);
        posX = getDimensionable().getWidth()/2;
        posY = getDimensionable().getHeight()/2;
        getRastros().clear();
        redraw();
    }
    
    public void resetPosition(){
        setDegree(0);
        int posXInical = posX;
        int posYInicial = posY;
        posX = getDimensionable().getWidth()/2;
        posY = getDimensionable().getHeight()/2;
        crearRastro(posXInical, posYInicial, posX, posY, color);
        redraw();
    }
    
    public void move(int distance){
        int x1 = posX;
        int y1 = posY;
        posX += Math.sin(Math.toRadians(getDegree()))*distance;
        posY += Math.cos(Math.toRadians(getDegree()))*distance;
        int x2 = posX;
        int y2 = posY;
        
        crearRastro(x1, y1, x2, y2,this.getColor());
        redraw();
    }
    
    @Override
    public void draw(Graphics g){
        ImageIcon tortuga = new ImageIcon(getClass().getResource("tortuga.png"));
        g.drawImage(tortuga.getImage(), posX, posY, width, height, null);
        dibujarRastro(g);
    }
    
    public String getColor() {
        return color;
    }
    
    
    public void crearRastro(int x1, int y1, int x2, int y2, String color){
        Rastro rastro = new Rastro(x1, x2, y1, y2,color);
        getRastros().add(rastro);
    }
    
    public void dibujarRastro(Graphics g) {
        for (Rastro actual : getRastros()) {
            g.setColor(Color.decode(actual.getColor()));
            g.drawLine(actual.getX1(), actual.getY1(), actual.getX2(), actual.getY2());
        }
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the degree
     */
    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree += degree;
    }
    
    public void changeDegree(int degree){
        setDegree(degree);
    }
    
    
    
    @Override
    public void redraw() {
        getDrawable().redraw();
    }
    
    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    /**
     * @return the drawable
     */
    public Drawable getDrawable() {
        return drawable;
    }

    /**
     * @return the dimensionable
     */
    public Dimensionable getDimensionable() {
        return dimensionable;
    }

    /**
     * @param dimensionable the dimensionable to set
     */
    public void setDimensionable(Dimensionable dimensionable) {
        this.dimensionable = dimensionable;
    }

    /**
     * @return the rastros
     */
    public ArrayList<Rastro> getRastros() {
        return rastros;
    }

    /**
     * @param rastros the rastros to set
     */
    public void setRastros(ArrayList<Rastro> rastros) {
        this.rastros = rastros;
    }
    
    
    
}
