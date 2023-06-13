/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netflix;

/**
 *
 * @author vitor.felicio
 */
public class Filme {
    private String NomeDoFilme;
    private String Categoria;
    private double Avaliacao;
    private int Ano;
    private String Protagonistas;
    private String Direcao;
    
    public void Filme(String NomeDoFilme, String Categoria, double Avaliacao, int Ano,String Protagonistas, String Direcao ){
        this.NomeDoFilme = NomeDoFilme;
        this.Categoria = Categoria;
        this.Avaliacao = Avaliacao;
        this.Ano = Ano;
        this.Protagonistas = Protagonistas;
        this.Direcao = Direcao;
    }

    public String getFilme() {
        return NomeDoFilme;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getAvaliacao() {
        return Avaliacao;
    }

    public int getAno() {
        return Ano;
    }

    public String getProtagonistas() {
        return Protagonistas;
    }

    public String getDirecao() {
        return Direcao;
    }
}
