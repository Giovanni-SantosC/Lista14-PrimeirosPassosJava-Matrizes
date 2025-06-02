package lista14;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex01Matriz3X3NumerosInteiros {

	public static void main(String[]args) {
		
		int[][] matriz = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exibição de Matriz 3x3:");
		System.out.println("Digite Valores Inteiros: ");
		
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				boolean entradaValida = false;
				
				while(!entradaValida) {
					
					try {
						System.out.println("Digite o Valor Para a Posição");
						matriz[linha][coluna]= sc.nextInt();
						entradaValida = true;
					}
					catch(InputMismatchException e) {
						System.out.println("Entrada Invalida.");
						sc.next();
						
					}
					
				}
			}
		}
		
		System.out.println("Matriz Preenchida");
		
		for(int linha = 0; linha < 3;linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println(matriz[coluna][linha] );
			}
			System.out.println(" ");
		}
		sc.close();
		
	}
	
}
