package lista14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05DiagonalSecundario3X3 {

	
public static void main(String[]args) {
		
		int[][] matriz = new int[3][3];
		
		int tamanho = matriz.length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diagonal Secundario de Uma Matriz 3x3:");
		System.out.println("Digite Valores Inteiros: ");
		
		for(int linha = 0; linha < tamanho; linha++) {
			for(int coluna = 0; coluna < tamanho; coluna++) {
				boolean entradaValida = false;
				
				while(!entradaValida) {
					try {
						System.out.println("Digite o Valor para a Posição: ");
						matriz[linha][coluna] = sc.nextInt();
						entradaValida = true;
					}
					catch(InputMismatchException e){
						
						System.out.println("Entrada Invalida.");
						sc.next();
						
					}
				}
			}
		}
		
		System.out.println("Matriz Completa: ");
		
		for(int linha = 0; linha < tamanho; linha++) {
			for(int coluna = 0; coluna < tamanho; coluna++) {
				System.out.println(matriz[linha][coluna]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(" Elementos Diagonal Secundaria: ");
		
		for(int linha = 0; linha < tamanho; linha++) {
			int coluna = (tamanho - 1) - linha;
			System.out.println(matriz[linha][coluna]);
			
		}
		
		sc.close();
	}
	
}
