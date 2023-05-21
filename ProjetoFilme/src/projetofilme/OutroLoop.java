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
public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao +=  nota;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
    }
}
