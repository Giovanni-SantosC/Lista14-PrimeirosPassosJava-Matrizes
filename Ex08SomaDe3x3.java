package lista14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08SomaDe3x3 {

	public static void main(String[] args) {

        
        int[][] matriz = new int[3][3];

        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cálculo da Soma dos Elementos de Cada Linha de uma Matriz 3x3 ---");
        System.out.println("Por favor, digite os valores inteiros para cada posição da matriz:");

        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                boolean entradaValida = false; 

                while (!entradaValida) {
                    try {
                        System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                        matriz[linha][coluna] = sc.nextInt();
                        entradaValida = true; 

                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
                        sc.next(); // 
                    }
                }
            }
        }

        System.out.println("\n--- Matriz Completa Digitada ---");
       
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");


       
        System.out.println("\n--- Soma dos elementos por linha ---");
       
        for (int linha = 0; linha < 3; linha++) {
            int somaLinha = 0; 

            
            for (int coluna = 0; coluna < 3; coluna++) {
                somaLinha += matriz[linha][coluna]; 
            }
            
            System.out.println("Soma da Linha " + linha + ": " + somaLinha);
        }
        System.out.println("-------------------------------------------------");


       
        sc.close();
    }
}
	

