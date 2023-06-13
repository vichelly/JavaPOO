/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netflix;

import java.util.ArrayList;

/**
 *
 * @author vitor.felicio
 */
public class Catalogo {
    private int NumeroDeFilmes = 0;
    private ArrayList<Filme> Filmes = new ArrayList<>();

    public void adicionaFilme(Filme filme) {
        this.Filmes.add(filme);
        this.NumeroDeFilmes ++;
    }

    public int getNumeroDeFilmes() {
        return NumeroDeFilmes;
    }

    public ArrayList<Filme> getFilmes() {
        return Filmes;
    }
    
}
