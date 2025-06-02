package lista14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10VerificacaoMatrizSimetrica {

	 public static void main(String[] args) {

	        
	        int[][] matriz = new int[3][3];
	        
	       
	        int tamanho = matriz.length; 

	       
	        boolean isSimetrica = true;

	      
	        Scanner sc= new Scanner(System.in);

	        System.out.println("--- Verificação de Simetria de uma Matriz 3x3 ---");
	        System.out.println("Uma matriz é simétrica se M[i][j] == M[j][i] para todas as posições.");
	        System.out.println("Por favor, digite os valores inteiros para cada posição da matriz:");

	        
	        for (int linha = 0; linha < tamanho; linha++) {
	            for (int coluna = 0; coluna < tamanho; coluna++) {
	                boolean entradaValida = false; 

	                while (!entradaValida) {
	                    try {
	                        System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
	                        matriz[linha][coluna] = sc.nextInt(); 
	                        entradaValida = true; 

	                    } catch (InputMismatchException e) {
	                        System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
	                        sc.next(); 
	                    }
	                }
	            }
	        }

	        System.out.println("\n--- Matriz Digitada ---");
	       
	        for (int linha = 0; linha < tamanho; linha++) {
	            for (int coluna = 0; coluna < tamanho; coluna++) {
	                System.out.print(matriz[linha][coluna] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println("----------------------------------------");


	        
	        boolean pararVerificacao = false; 

	        for (int i = 0; i < tamanho; i++) {
	            for (int j = i + 1; j < tamanho; j++) {
	                
	                if (matriz[i][j] != matriz[j][i]) {
	                    isSimetrica = false;        
	                    pararVerificacao = true;    
	                    break;                      
	                }
	            }
	            if (pararVerificacao) {
	                break; 
	            }
	        }

	        
	        System.out.println("\n--- Resultado da Verificação ---");
	        if (isSimetrica) {
	            System.out.println("A matriz é simétrica.");
	        } else {
	            System.out.println("A matriz NÃO é simétrica.");
	        }
	        System.out.println("----------------------------------------");


	        
	        sc.close();
	    }
	}
	

