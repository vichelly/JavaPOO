package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Saturno {
    private int peso;
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int calculaSaturno(){
        return (int) (peso * 1.15);
    }
}
