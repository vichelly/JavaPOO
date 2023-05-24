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
public class Mercurio extends Planet {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaMercurio(){
        double response = (peso * 0.37);
        String ResponseHist = String.valueOf(peso)+"=>"+String.valueOf(response)+"(Mercurio)";
        PesoEmPlanetas.historico.add(ResponseHist);
        return response;
    }
}
