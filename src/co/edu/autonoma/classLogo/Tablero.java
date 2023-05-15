/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

/**
 *
 * @author ASUS
 */
public class Tablero extends Sprite implements Drawable,Dimensionable {

    public Tablero(int posX, int posY, int width, int height) {
        super(posX, posY, width, height);
    }

    @Override
    public void redraw() {
       
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
       return 0;
    }
    
}
