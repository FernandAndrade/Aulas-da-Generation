import java.util.Scanner;

public class LacosJavaQ5 {

	
	public static void main(String[] args) {
		int num, somanum=0, cont=0;
		Scanner ler = new Scanner (System.in);
	
	do 
	{
		System.out.println("Entre com número: ");
		num = ler.nextInt();
		cont++;
		somanum = somanum+num;
	}
	while (num!=0);	
		 System.out.printf("Soma: %d",somanum);
	
		}
	
}
