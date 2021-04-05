import java.util.Scanner;

public class LacosJavaQ3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos.
		 *  Total de pessoas com mais de 50 anos. 
		 *  O programa termina quando idade for =-99
		 */
		int id=1, totmenos21=0, totmais50=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Entre com a idade:");
		id = ler.nextInt();
		while (id>=1) 
		{
			if (id<=21) 
			{		
				totmenos21++;	
			}
		 if (id>=50)
			{
			totmais50++;
			}
		 System.out.printf("\nEntre com sua idade: ");
			id = ler.nextInt();
	} 
	
	 System.out.printf("Total de pessoas com menos de 21: "+ totmenos21 + " e total de pessoas com mais de 50: " + totmais50);
}
}