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
public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações " + mediaAvaliacao/3);

    }
}
