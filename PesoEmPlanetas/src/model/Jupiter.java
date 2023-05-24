package model;

import controller.PesoEmPlanetas;


public class Jupiter extends Planet {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaJupiter(){
        double response = (peso * 2.64);
        String ResponseHist = String.valueOf(peso)+"=>"+String.valueOf(response)+"(Jupiter)";
        PesoEmPlanetas.historico.add(ResponseHist);
        return response;
    }
}
