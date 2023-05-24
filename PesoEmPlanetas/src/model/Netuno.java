package model;

import controller.PesoEmPlanetas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor.felicio
 */
public class Netuno extends Planet {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaNetuno(){
        double response = (peso * 1.18);
        String ResponseHist = String.valueOf(peso)+"=>"+String.valueOf(response)+"(Netuno)";
        PesoEmPlanetas.historico.add(ResponseHist);
        return response;
    }
}
