package model;

import controller.PesoEmPlanetas;
import model.Planet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Saturno extends Planet {
    private int peso;
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaSaturno(){
        double response = (peso * 1.15);
        String ResponseHist = String.valueOf(peso)+"=>"+String.valueOf(response)+"(Saturno)";
        PesoEmPlanetas.historico.add(ResponseHist);
        return response;
    }
}
