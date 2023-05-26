package pesoplanetas2;

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
    
    public double calculaSaturno(){
        double response = (peso * 1.15);
        PesoPlanetas2.ListHist.add(peso+"=>"+response);
        return response;
    }
}
