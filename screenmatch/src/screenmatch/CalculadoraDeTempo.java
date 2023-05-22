/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screenmatch;

/**
 *
 * @author vitor.felicio
 */
public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: "+titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
