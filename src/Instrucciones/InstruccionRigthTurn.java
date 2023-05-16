/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instrucciones;

/**
 *
 * @author ASUS
 */
public class InstruccionRigthTurn extends InstruccionTortuga{
    private int degree;

    public InstruccionRigthTurn(int degree) {
        this.degree = degree;
    }


    /**
     * @return the degree
     */
    public int getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }
}
