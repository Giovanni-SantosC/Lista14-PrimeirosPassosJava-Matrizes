package lista14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07NumerosPares4x4 {

	public static void main(String[] args) {

     
        int[][] matriz = new int[4][4];

        
        int contadorPares = 0;

        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Contagem de Números Pares em uma Matriz 4x4 ---");
        System.out.println("Por favor, digite os valores inteiros para cada posição da matriz:");

      
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                boolean entradaValida = false; 

                while (!entradaValida) {
                    try {
                        System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                        int valorLido = sc.nextInt(); 
                        matriz[linha][coluna] = valorLido; 

                        
                        if (valorLido % 2 == 0) { 
                            contadorPares++;     
                        }
                        entradaValida = true; 

                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
                        sc.next(); // 
                    }
                }
            }
        }

        System.out.println("\n--- Matriz Completa Digitada ---");
       
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");


        
        System.out.println("Quantidade de números pares na matriz: " + contadorPares);
        System.out.println("-------------------------------------------------");


        
        sc.close();
    }
}
	

