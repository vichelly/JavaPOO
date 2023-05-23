/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package screenmatch;

/**
 *
 * @author vluca
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Filme meuFilme = new Filme();
        
        meuFilme.setNome("Skibiridop");
        meuFilme.setAnoDeLancamento(1234);
        
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(6);
        System.out.println(meuFilme.pegaMedia());
        
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(1999);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(14);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração em min para maratonar lost: "+lost.getDuracaoEmMinutos());
        
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
        
        Filme outroFilme = new Filme();
        
        outroFilme.setNome("YESYESYESYES");
        outroFilme.setAnoDeLancamento(1234);
        
        outroFilme.setDuracaoEmMinutos(240);
        
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
        
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
    
}
