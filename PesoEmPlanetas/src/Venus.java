/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Venus {
    private double peso;
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaVenus(){
        return (double) (peso * 0.88);
    }
}
