/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

/**
 *
 * @author ASUS
 */
public class InstruccionForward extends InstruccionTortuga {
    private int distance;

    public InstruccionForward(int distance) {
        this.distance = distance;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    public int parameter(){
        return -getDistance();
    }
    
}
