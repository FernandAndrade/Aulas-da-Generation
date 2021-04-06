import java.util.Scanner;

public class ArraysMatriz {

	public static void main(String[] args) {
		/*
		 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
		 * possui.
		 */
		int cont = 0;
		int[][] matriz = new int[3][3];
		Scanner ler = new Scanner(System.in);
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Entre com número: ");
				matriz[linha][coluna] = ler.nextInt();

				if (matriz[linha][coluna] > 10) {
					cont++;
				}

			}
			
		} System.out.println(cont);
	} 
}
