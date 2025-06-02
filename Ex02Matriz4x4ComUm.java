package lista14;

public class Ex02Matriz4x4ComUm {

	public static void main(String[]args) {
		int [][] matriz = new int [4][4];
		
		System.out.println("Preenchimento de uma Matriz 4x4 com o Numero 1:");
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = 1;
			}
		}
		
		System.out.println("Matriz Completa: ");
		
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.println(matriz[linha][coluna] + "\t");
			}
			System.out.println(" ");
		}
	}
	
}
