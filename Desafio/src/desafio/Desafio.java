/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author vluca
 */
public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark";
        String tipoConta = "Corrente";
        double saldo = 1599.9;
        int opcao = 0;
        
        System.out.println("*******************");
        System.out.println("\nNome do cliente: "+nome);
        System.out.println("Tipo conta: "+tipoConta);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("\n*******************");
        
        String menu = """
                      **Digite sua opção**
                      1 - Consultar saldo
                      2 - Transferir valor
                      3 - Receber valor
                      4 - Sair
                      """;
        
        Scanner scan = new Scanner(System.in);
        
        while (opcao != 4){
            System.out.println(menu);
            opcao = scan.nextInt();
            if (opcao == 1){
                System.out.println("O saldo atualizado é: "+saldo);
            }else if(opcao == 2){
                System.out.println("Qual é o valor que deseja transferir");
                double valor = scan.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para a transferencia");
                }
                else{
                    saldo -= valor;
                    System.out.println("Novo saldo: "+saldo);
                }
            }else if(opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = scan.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo "+saldo);
            }else if(opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
    
}
