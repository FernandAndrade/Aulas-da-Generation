package Turma20;

import java.util.Scanner;

public class Questao3lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite a idade do competidor: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14)
 		{
 			System.out.println("\nCompetidor está na categoria Infantil"); 
 		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("\nCompetidor está na categoria Juvenil"); 
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("\nCompetidor está na categoria Adulto");
		}
		else  
		{
			System.out.println("\nEsta competição não tem categoria para você. :(");
		}
	}

}
