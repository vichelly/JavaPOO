package pesoplanetas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Urano {
    private int peso;
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaUrano(){
        double response = (peso * 1.17);
        PesoPlanetas2.ListHist.add(peso+"=>"+response);
        return response;
    }
}
