package pesoplanetas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Jupiter {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaJupiter(){
        double response = (peso * 2.64);
        return response;
    }
}
