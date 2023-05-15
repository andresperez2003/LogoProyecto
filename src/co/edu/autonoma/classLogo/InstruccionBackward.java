/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

/**
 *
 * @author ASUS
 */
public class InstruccionBackward extends InstruccionTortuga {
    private int distance;


    
    public InstruccionBackward(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public int parameter(){
        return getDistance();
    }
    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = -distance;
    }
}
