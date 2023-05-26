package pesoplanetas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Netuno {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaNetuno(){
        double response = (peso * 1.18);
        PesoPlanetas2.ListHist.add(peso+"=>"+response);
        return response;
    }
}
