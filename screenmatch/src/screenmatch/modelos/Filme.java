/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

/**
 *
 * @author vluca
 */
public class Filme extends Titulo implements Classificavel {
    private String diretor;
    
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
    
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2 ;
    }

    @Override
    public String toString() {
        return "Filme: "+this.getNome() + " ("+this.getAnoDeLancamento()+")"; 
    }
    
    
}
