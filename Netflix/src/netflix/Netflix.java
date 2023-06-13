/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package netflix;

/**
 *
 * @author vitor.felicio
 */
public class Netflix {

    /**
     * @param args the command line arguments
     */
    public static Catalogo catalogo = new Catalogo();
    public static void main(String[] args) {
        // TODO code application logic here
        RecomendacaoDeFilmes recomendacao = new RecomendacaoDeFilmes();
        recomendacao.setTitle("Recomendação de Filmes");
        recomendacao.setVisible(true);
    }
    
}
