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
        
        meuFilme.nome = "Skibiridop";
        meuFilme.anoDeLancamento = 1234;
        
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(6);
        System.out.println(meuFilme.pegaMedia());
    }
    
}
