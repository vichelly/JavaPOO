/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofilme;
import java.util.Scanner;

/**
 *
 * @author vluca
 */
public class Leitura {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite seu filme favorito");
            String filme = leitura.nextLine();
            
            System.out.println("Qual o ano do lançamento?");
            int anoFilme = leitura.nextInt();
            
            System.out.println("Diga sua avaliação para o filme: ");
            double avaliacao = leitura.nextDouble();
            
            
            System.out.println("Seu filme favorito é: "+filme);
            System.out.println("O ano de lançamento é: "+anoFilme);
            System.out.println("A avaliação do filme foi: "+avaliacao);
    }
}
