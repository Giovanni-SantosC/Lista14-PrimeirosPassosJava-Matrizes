package lista14;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex03Matriz2x2Soma {

	public static void main(String[]args) {
		
		int[][] matriz = new int [2][2];
		
		int somaTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo da Soma Dos Elementos da Matriz: ");
		System.out.println("Digite Apenas Valores Inteiros.");
		
		for(int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				boolean entradaValida = false;
				
				while(!entradaValida) {
					try {
						System.out.println("Digite o Valor Para a Posição");
						int valorLido = sc.nextInt();
						matriz[linha][coluna] = valorLido;
						somaTotal += valorLido;
						entradaValida = true;
					}
					catch(InputMismatchException e) {
						System.out.println("Entrada invalida.");
						sc.next();
						
					}
				}
			}
			
		}
		
		System.out.println("Matriz Completa: ");
		
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna  < 2; coluna++) {
				System.out.println(matriz[linha][coluna]);
			}
			System.out.println(" ");
		}
		
		System.out.println("A Soma de Todos os Elementos da Matriz é: " + somaTotal);
		
		sc.close();
	}
	
}
