package lista14;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex04MostrarElementosDiagonal {

	public static void main(String[]args) {
		
		int[][] matriz = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diagonal de Uma Matriz 3x3:");
		System.out.println("Digite Valores Inteiros: ");
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				boolean entradaValida = false;
				
				while(!entradaValida) {
					try {
						System.out.println("Digite o Valor para a Posição: ");
						matriz[linha][coluna] = sc.nextInt();
						entradaValida = true;
					}
					catch(InputMismatchException e){
						
						System.out.println("Entrada Invali.");
						sc.next();
						
					}
				}
			}
		}
		
		System.out.println("Matriz Completa: ");
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println(matriz[linha][coluna]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(" Elementos Diagonal Principal: ");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(matriz[i][i]);
			
		}
		
		sc.close();
	}
	
}
