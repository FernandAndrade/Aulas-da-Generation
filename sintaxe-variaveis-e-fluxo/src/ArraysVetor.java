import java.util.Scanner;

public class ArraysVetor {
	public static void main(String[] args) {
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
		int num[] = new int[6];
		int somapar = 0, contimpar = 0;
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 6; i++) 
		{ System.out.println("\nInforme a " + (i + 1) + "ª posição:");
			num[i] = leia.nextInt();
	
			if (num[i] % 2 == 0) 
			{
				somapar = somapar + num[i];
			} 
			else 
			{
				contimpar++;
			}
		}
		for(int i=0;i<6;i++)
		{
			if (num[i] % 2 == 0) 
			{
					System.out.println(num[i] + " Número par");
			}
			else 
			{ 
				System.out.println(num[i] + " Número ímpar");
			}
		}
	
			System.out.println("\nSoma dos números pares: " + somapar);
			System.out.println("\nQuantidade dos números ímpares: " + contimpar);
		}
	}

