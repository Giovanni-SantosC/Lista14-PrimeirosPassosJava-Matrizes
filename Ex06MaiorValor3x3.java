package lista14;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Ex06MaiorValor3x3 {

	public static void main(String[] args) {

      
        int[][] matriz = new int[3][3];

       
        int maiorValor = Integer.MIN_VALUE;

      
        Scanner sc= new Scanner(System.in);

        System.out.println("--- Encontrando o Maior Valor em uma Matriz 3x3 ---");
        System.out.println("Por favor, digite os valores inteiros para cada posição da matriz:");

      
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                boolean entradaValida = false; 

                while (!entradaValida) {
                    try {
                        System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                        int valorLido = sc.nextInt();
                        matriz[linha][coluna] = valorLido;

                        if (valorLido > maiorValor) {
                            maiorValor = valorLido;                         }
                        entradaValida = true; // 

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


       
        System.out.println("O maior valor na matriz é: " + maiorValor);
        System.out.println("-------------------------------------------------");


        
        sc.close();
    }
	}

