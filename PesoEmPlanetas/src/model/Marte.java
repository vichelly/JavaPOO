package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Marte {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaMarte(){
        return (double) (peso * 0.38);
    }
}
