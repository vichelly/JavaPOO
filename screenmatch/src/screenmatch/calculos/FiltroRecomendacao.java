/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screenmatch.calculos;

/**
 *
 * @author vitor.felicio
 */
public class FiltroRecomendacao {
    
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
            
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avalidado no momento");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
